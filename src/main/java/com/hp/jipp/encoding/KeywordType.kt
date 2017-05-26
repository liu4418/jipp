package com.hp.jipp.encoding

import com.hp.jipp.util.Util

import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException

class KeywordType<T : Keyword>(encoder: KeywordType.Encoder<T>, name: String) :
        AttributeType<T>(encoder, Tag.Keyword, name) {

    /** An encoder for Keyword types  */
    class Encoder<T : Keyword>(private val factory: Keyword.Factory<T>, all: Collection<T>, name: String) :
            SimpleEncoder<T>(name) {

        private val map: Map<String, T> = all.map { it.name to it }.toMap()

        @Throws(IOException::class)
        override fun readValue(input: DataInputStream, valueTag: Tag): T {
            val key = StringType.ENCODER.readValue(input, valueTag)
            return map[key] ?: factory.of(key)
        }

        @Throws(IOException::class)
        override fun writeValue(out: DataOutputStream, value: T) {
            StringType.ENCODER.writeValue(out, value.name)
        }

        override fun valid(valueTag: Tag) = valueTag == Tag.Keyword

        val all: Collection<T>
            get() = map.values

        companion object {
            fun <T : Keyword> of(cls: Class<T>, factory: Keyword.Factory<T>): Encoder<T> =
                Encoder(factory, Util.getStaticObjects(cls)
                        .filter { cls.isAssignableFrom(it.javaClass) }
                        .map {
                            @Suppress("UNCHECKED_CAST")
                            it as T
                        }, cls.simpleName)
        }
    }
}