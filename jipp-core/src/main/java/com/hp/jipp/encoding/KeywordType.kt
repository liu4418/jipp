// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/** An attribute type containing keyword values as [String]s. */
open class KeywordType(override val name: String) : AttributeType<String> {
    override fun coerce(value: Any) =
        value as? String

    override fun toString() = "KeywordType($name)"

    companion object {
        val codec = Codec(Tag.keyword, {
            readString()
        }, {
            writeStringValue(it)
        })
    }
}
