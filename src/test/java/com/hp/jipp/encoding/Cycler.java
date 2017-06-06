package com.hp.jipp.encoding;

import com.hp.jipp.model.Attributes;
import com.hp.jipp.model.Packet;
import com.hp.jipp.util.ParseError;
import com.hp.jipp.util.Reflect;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Cycler {

    public static final Packet.Parser sParser = Packet.parserOf(Attributes.All);
    public static final Map<String, AttributeType<?>> sAttributeTypeMap = new HashMap<>();
    static {
        for (AttributeType<?> entry: Attributes.All) {
            sAttributeTypeMap.put(entry.getName(), entry);
        }
    }

    public static final Encoder.Finder sFinder = new Encoder.Finder() {
        @Override
        public Encoder<?> find(Tag valueTag, String name) throws IOException {
            // Check for a matching attribute type
            if (sAttributeTypeMap.containsKey(name)) {
                AttributeType<?> attributeType = sAttributeTypeMap.get(name);
                if (attributeType.getEncoder().valid(valueTag)) {
                    return attributeType.getEncoder();
                }
            }

            // If no valid match above then try with each default encoder
            for (Encoder<?> encoder: AttributeGroup.ENCODERS) {
                if (encoder.valid(valueTag)) {
                    return encoder;
                }
            }
            throw new ParseError("No encoder found for " + name + "(" + valueTag + ")");
        }
    };

    public static AttributeGroup cycle(AttributeGroup group) throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(toBytes(group)));
        return AttributeGroup.read(Tag.read(in), sAttributeTypeMap, in);
    }

    public static byte[] toBytes(AttributeGroup group) throws IOException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bytesOut);
        group.write(out);
        Tag.EndOfAttributes.write(out);
        return bytesOut.toByteArray();
    }

    @SuppressWarnings("unchecked")
    public static <T> Attribute<T> cycle(AttributeType attributeType, Attribute<T> attribute)
            throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(toBytes(attribute)));
        Tag tag = Tag.read(in);
        String name = new String(IppEncodingsKt.readValueBytes(in), Reflect.UTF8);
        return attributeType.getEncoder().read(in, sFinder, tag, name);
    }

    @SuppressWarnings("unchecked")
    public static <T> Attribute<T> cycle(Attribute<T> attribute) throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(toBytes(attribute)));
        return (Attribute<T>) Attribute.read(in, sFinder, Tag.read(in));
    }


    public static byte[] toBytes(Attribute<?> attribute) throws IOException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        attribute.write(new DataOutputStream(bytesOut));
        return bytesOut.toByteArray();
    }

    public static Packet cycle(Packet in) throws IOException {
        return sParser.parse(new DataInputStream(new ByteArrayInputStream(toBytes(in))));
    }

    public static Packet cycle(Packet.Builder in) throws IOException {
        return cycle(in.build());
    }

    public static byte[] toBytes(Packet in) throws IOException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bytesOut);
        in.write(out);
        return bytesOut.toByteArray();
    }
}
