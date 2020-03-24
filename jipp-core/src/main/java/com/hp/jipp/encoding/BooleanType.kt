// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/** An attribute type containing boolean values. */
open class BooleanType(override val name: String) : AttributeType<Boolean> {
    override fun coerce(value: Any) =
        value as? Boolean

    override fun toString() = "BooleanType($name)"

    companion object {
        val codec = Codec(Tag.booleanValue, {
            readByteValue() != 0.toByte()
        }, {
            writeByteValue(if (it) 0x01 else 0x00)
        })
    }
}
