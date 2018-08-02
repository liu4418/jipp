// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "document-format-details" collection as defined in:
 * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DocumentFormatDetails
@JvmOverloads constructor(
    val documentFormat: String? = null,
    val documentFormatDeviceId: String? = null,
    val documentFormatVersion: String? = null,
    val documentNaturalLanguage: List<String>? = null,
    val documentSourceApplicationName: String? = null,
    val documentSourceApplicationVersion: String? = null,
    val documentSourceOsName: String? = null,
    val documentSourceOsVersion: String? = null,
    /** Encoded form, if known. */
    val _encoded: List<Attribute<*>>? = null
) : AttributeCollection {

    /** Produce an attribute list from members, or return the original [_encoded] attribute list if present. */
    override val attributes: List<Attribute<*>> by lazy {
        _encoded ?: listOfNotNull(
            documentFormat?.let { Members.documentFormat.of(it) },
            documentFormatDeviceId?.let { Members.documentFormatDeviceId.of(it) },
            documentFormatVersion?.let { Members.documentFormatVersion.of(it) },
            documentNaturalLanguage?.let { Members.documentNaturalLanguage.of(it) },
            documentSourceApplicationName?.let { Members.documentSourceApplicationName.of(it) },
            documentSourceApplicationVersion?.let { Members.documentSourceApplicationVersion.of(it) },
            documentSourceOsName?.let { Members.documentSourceOsName.of(it) },
            documentSourceOsVersion?.let { Members.documentSourceOsVersion.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<DocumentFormatDetails>(Members)

    /** All member names as strings. */
    object Name {
        /** "document-format" member name */
        const val documentFormat = "document-format"
        /** "document-format-device-id" member name */
        const val documentFormatDeviceId = "document-format-device-id"
        /** "document-format-version" member name */
        const val documentFormatVersion = "document-format-version"
        /** "document-natural-language" member name */
        const val documentNaturalLanguage = "document-natural-language"
        /** "document-source-application-name" member name */
        const val documentSourceApplicationName = "document-source-application-name"
        /** "document-source-application-version" member name */
        const val documentSourceApplicationVersion = "document-source-application-version"
        /** "document-source-os-name" member name */
        const val documentSourceOsName = "document-source-os-name"
        /** "document-source-os-version" member name */
        const val documentSourceOsVersion = "document-source-os-version"
    }

    /** Builder for immutable [DocumentFormatDetails] objects. */
    class Builder() {
        /** Constructs a new [Builder] pre-initialized with values in [source]. */
        constructor(source: DocumentFormatDetails) : this() {
            documentFormat = source.documentFormat
            documentFormatDeviceId = source.documentFormatDeviceId
            documentFormatVersion = source.documentFormatVersion
            documentNaturalLanguage = source.documentNaturalLanguage
            documentSourceApplicationName = source.documentSourceApplicationName
            documentSourceApplicationVersion = source.documentSourceApplicationVersion
            documentSourceOsName = source.documentSourceOsName
            documentSourceOsVersion = source.documentSourceOsVersion
        }
        var documentFormat: String? = null
        var documentFormatDeviceId: String? = null
        var documentFormatVersion: String? = null
        var documentNaturalLanguage: List<String>? = null
        var documentSourceApplicationName: String? = null
        var documentSourceApplicationVersion: String? = null
        var documentSourceOsName: String? = null
        var documentSourceOsVersion: String? = null

        /** Return a new [DocumentFormatDetails] object containing all values initialized in this builder. */
        fun build() = DocumentFormatDetails(
            documentFormat,
            documentFormatDeviceId,
            documentFormatVersion,
            documentNaturalLanguage,
            documentSourceApplicationName,
            documentSourceApplicationVersion,
            documentSourceOsName,
            documentSourceOsVersion
        )
    }

    companion object Members : AttributeCollection.Converter<DocumentFormatDetails> {
        override fun convert(attributes: List<Attribute<*>>): DocumentFormatDetails =
            DocumentFormatDetails(
                extractOne(attributes, documentFormat),
                extractOne(attributes, documentFormatDeviceId)?.value,
                extractOne(attributes, documentFormatVersion)?.value,
                extractAll(attributes, documentNaturalLanguage),
                extractOne(attributes, documentSourceApplicationName)?.value,
                extractOne(attributes, documentSourceApplicationVersion)?.value,
                extractOne(attributes, documentSourceOsName)?.value,
                extractOne(attributes, documentSourceOsVersion)?.value,
                _encoded = attributes)
        /**
         * "document-format" member type.
         */
        @JvmField val documentFormat = StringType(Tag.mimeMediaType, Name.documentFormat)
        /**
         * "document-format-device-id" member type.
         */
        @JvmField val documentFormatDeviceId = TextType(Name.documentFormatDeviceId)
        /**
         * "document-format-version" member type.
         */
        @JvmField val documentFormatVersion = TextType(Name.documentFormatVersion)
        /**
         * "document-natural-language" member type.
         */
        @JvmField val documentNaturalLanguage = StringType(Tag.naturalLanguage, Name.documentNaturalLanguage)
        /**
         * "document-source-application-name" member type.
         */
        @JvmField val documentSourceApplicationName = NameType(Name.documentSourceApplicationName)
        /**
         * "document-source-application-version" member type.
         */
        @JvmField val documentSourceApplicationVersion = TextType(Name.documentSourceApplicationVersion)
        /**
         * "document-source-os-name" member type.
         */
        @JvmField val documentSourceOsName = NameType(Name.documentSourceOsName)
        /**
         * "document-source-os-version" member type.
         */
        @JvmField val documentSourceOsVersion = TextType(Name.documentSourceOsVersion)
    }
}
