// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-col" collection as defined in:
 * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf),
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaCol
@JvmOverloads constructor(
    /** May contain any keyword from [MediaBackCoating] or a name. */
    val mediaBackCoating: String? = null,
    val mediaBottomMargin: Int? = null,
    /** May contain any keyword from [MediaColor] or a name. */
    val mediaColor: String? = null,
    /** May contain any keyword from [MediaBackCoating] or a name. */
    val mediaFrontCoating: String? = null,
    /** May contain any keyword from [MediaGrain] or a name. */
    val mediaGrain: String? = null,
    val mediaHoleCount: Int? = null,
    val mediaInfo: String? = null,
    /** May contain any keyword from [Media] or a name. */
    val mediaKey: String? = null,
    val mediaLeftMargin: Int? = null,
    val mediaOrderCount: Int? = null,
    /** May contain any keyword from [MediaPrePrinted] or a name. */
    val mediaPrePrinted: String? = null,
    /** May contain any keyword from [MediaRecycled] or a name. */
    val mediaRecycled: String? = null,
    val mediaRightMargin: Int? = null,
    val mediaSize: MediaSize? = null,
    /** May contain any keyword from [Media] or a name. */
    val mediaSizeName: String? = null,
    /** May contain any keyword from [MediaSource] or a name. */
    val mediaSource: String? = null,
    val mediaSourceProperties: MediaSourceProperties? = null,
    val mediaThickness: Int? = null,
    /** May contain any keyword from [MediaTooth] or a name. */
    val mediaTooth: String? = null,
    val mediaTopMargin: Int? = null,
    /** May contain any keyword from [MediaType] or a name. */
    val mediaType: String? = null,
    val mediaWeightMetric: Int? = null,
    /** Encoded form, if known. */
    val _encoded: List<Attribute<*>>? = null
) : AttributeCollection {

    /** Produce an attribute list from members, or return the original [_encoded] attribute list if present. */
    override val attributes: List<Attribute<*>> by lazy {
        _encoded ?: listOfNotNull(
            mediaBackCoating?.let { Members.mediaBackCoating.of(it) },
            mediaBottomMargin?.let { Members.mediaBottomMargin.of(it) },
            mediaColor?.let { Members.mediaColor.of(it) },
            mediaFrontCoating?.let { Members.mediaFrontCoating.of(it) },
            mediaGrain?.let { Members.mediaGrain.of(it) },
            mediaHoleCount?.let { Members.mediaHoleCount.of(it) },
            mediaInfo?.let { Members.mediaInfo.of(it) },
            mediaKey?.let { Members.mediaKey.of(it) },
            mediaLeftMargin?.let { Members.mediaLeftMargin.of(it) },
            mediaOrderCount?.let { Members.mediaOrderCount.of(it) },
            mediaPrePrinted?.let { Members.mediaPrePrinted.of(it) },
            mediaRecycled?.let { Members.mediaRecycled.of(it) },
            mediaRightMargin?.let { Members.mediaRightMargin.of(it) },
            mediaSize?.let { Members.mediaSize.of(it) },
            mediaSizeName?.let { Members.mediaSizeName.of(it) },
            mediaSource?.let { Members.mediaSource.of(it) },
            mediaSourceProperties?.let { Members.mediaSourceProperties.of(it) },
            mediaThickness?.let { Members.mediaThickness.of(it) },
            mediaTooth?.let { Members.mediaTooth.of(it) },
            mediaTopMargin?.let { Members.mediaTopMargin.of(it) },
            mediaType?.let { Members.mediaType.of(it) },
            mediaWeightMetric?.let { Members.mediaWeightMetric.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<MediaCol>(Members)

    /** All member names as strings. */
    object Name {
        /** "media-back-coating" member name */
        const val mediaBackCoating = "media-back-coating"
        /** "media-bottom-margin" member name */
        const val mediaBottomMargin = "media-bottom-margin"
        /** "media-color" member name */
        const val mediaColor = "media-color"
        /** "media-front-coating" member name */
        const val mediaFrontCoating = "media-front-coating"
        /** "media-grain" member name */
        const val mediaGrain = "media-grain"
        /** "media-hole-count" member name */
        const val mediaHoleCount = "media-hole-count"
        /** "media-info" member name */
        const val mediaInfo = "media-info"
        /** "media-key" member name */
        const val mediaKey = "media-key"
        /** "media-left-margin" member name */
        const val mediaLeftMargin = "media-left-margin"
        /** "media-order-count" member name */
        const val mediaOrderCount = "media-order-count"
        /** "media-pre-printed" member name */
        const val mediaPrePrinted = "media-pre-printed"
        /** "media-recycled" member name */
        const val mediaRecycled = "media-recycled"
        /** "media-right-margin" member name */
        const val mediaRightMargin = "media-right-margin"
        /** "media-size" member name */
        const val mediaSize = "media-size"
        /** "media-size-name" member name */
        const val mediaSizeName = "media-size-name"
        /** "media-source" member name */
        const val mediaSource = "media-source"
        /** "media-source-properties" member name */
        const val mediaSourceProperties = "media-source-properties"
        /** "media-thickness" member name */
        const val mediaThickness = "media-thickness"
        /** "media-tooth" member name */
        const val mediaTooth = "media-tooth"
        /** "media-top-margin" member name */
        const val mediaTopMargin = "media-top-margin"
        /** "media-type" member name */
        const val mediaType = "media-type"
        /** "media-weight-metric" member name */
        const val mediaWeightMetric = "media-weight-metric"
    }

    /** Builder for immutable [MediaCol] objects. */
    class Builder() {
        /** Constructs a new [Builder] pre-initialized with values in [source]. */
        constructor(source: MediaCol) : this() {
            mediaBackCoating = source.mediaBackCoating
            mediaBottomMargin = source.mediaBottomMargin
            mediaColor = source.mediaColor
            mediaFrontCoating = source.mediaFrontCoating
            mediaGrain = source.mediaGrain
            mediaHoleCount = source.mediaHoleCount
            mediaInfo = source.mediaInfo
            mediaKey = source.mediaKey
            mediaLeftMargin = source.mediaLeftMargin
            mediaOrderCount = source.mediaOrderCount
            mediaPrePrinted = source.mediaPrePrinted
            mediaRecycled = source.mediaRecycled
            mediaRightMargin = source.mediaRightMargin
            mediaSize = source.mediaSize
            mediaSizeName = source.mediaSizeName
            mediaSource = source.mediaSource
            mediaSourceProperties = source.mediaSourceProperties
            mediaThickness = source.mediaThickness
            mediaTooth = source.mediaTooth
            mediaTopMargin = source.mediaTopMargin
            mediaType = source.mediaType
            mediaWeightMetric = source.mediaWeightMetric
        }
        /** May contain any keyword from [MediaBackCoating] or a name. */
        var mediaBackCoating: String? = null
        var mediaBottomMargin: Int? = null
        /** May contain any keyword from [MediaColor] or a name. */
        var mediaColor: String? = null
        /** May contain any keyword from [MediaBackCoating] or a name. */
        var mediaFrontCoating: String? = null
        /** May contain any keyword from [MediaGrain] or a name. */
        var mediaGrain: String? = null
        var mediaHoleCount: Int? = null
        var mediaInfo: String? = null
        /** May contain any keyword from [Media] or a name. */
        var mediaKey: String? = null
        var mediaLeftMargin: Int? = null
        var mediaOrderCount: Int? = null
        /** May contain any keyword from [MediaPrePrinted] or a name. */
        var mediaPrePrinted: String? = null
        /** May contain any keyword from [MediaRecycled] or a name. */
        var mediaRecycled: String? = null
        var mediaRightMargin: Int? = null
        var mediaSize: MediaSize? = null
        /** May contain any keyword from [Media] or a name. */
        var mediaSizeName: String? = null
        /** May contain any keyword from [MediaSource] or a name. */
        var mediaSource: String? = null
        var mediaSourceProperties: MediaSourceProperties? = null
        var mediaThickness: Int? = null
        /** May contain any keyword from [MediaTooth] or a name. */
        var mediaTooth: String? = null
        var mediaTopMargin: Int? = null
        /** May contain any keyword from [MediaType] or a name. */
        var mediaType: String? = null
        var mediaWeightMetric: Int? = null

        /** Return a new [MediaCol] object containing all values initialized in this builder. */
        fun build() = MediaCol(
            mediaBackCoating,
            mediaBottomMargin,
            mediaColor,
            mediaFrontCoating,
            mediaGrain,
            mediaHoleCount,
            mediaInfo,
            mediaKey,
            mediaLeftMargin,
            mediaOrderCount,
            mediaPrePrinted,
            mediaRecycled,
            mediaRightMargin,
            mediaSize,
            mediaSizeName,
            mediaSource,
            mediaSourceProperties,
            mediaThickness,
            mediaTooth,
            mediaTopMargin,
            mediaType,
            mediaWeightMetric
        )
    }

    companion object Members : AttributeCollection.Converter<MediaCol> {
        override fun convert(attributes: List<Attribute<*>>): MediaCol =
            MediaCol(
                extractOne(attributes, mediaBackCoating),
                extractOne(attributes, mediaBottomMargin),
                extractOne(attributes, mediaColor),
                extractOne(attributes, mediaFrontCoating),
                extractOne(attributes, mediaGrain),
                extractOne(attributes, mediaHoleCount),
                extractOne(attributes, mediaInfo)?.value,
                extractOne(attributes, mediaKey),
                extractOne(attributes, mediaLeftMargin),
                extractOne(attributes, mediaOrderCount),
                extractOne(attributes, mediaPrePrinted),
                extractOne(attributes, mediaRecycled),
                extractOne(attributes, mediaRightMargin),
                extractOne(attributes, mediaSize),
                extractOne(attributes, mediaSizeName),
                extractOne(attributes, mediaSource),
                extractOne(attributes, mediaSourceProperties),
                extractOne(attributes, mediaThickness),
                extractOne(attributes, mediaTooth),
                extractOne(attributes, mediaTopMargin),
                extractOne(attributes, mediaType),
                extractOne(attributes, mediaWeightMetric),
                _encoded = attributes)
        /**
         * "media-back-coating" member type.
         * May contain any keyword from [MediaBackCoating] or a name.
         */
        @JvmField val mediaBackCoating = KeywordType(Name.mediaBackCoating)
        /**
         * "media-bottom-margin" member type.
         */
        @JvmField val mediaBottomMargin = IntType(Name.mediaBottomMargin)
        /**
         * "media-color" member type.
         * May contain any keyword from [MediaColor] or a name.
         */
        @JvmField val mediaColor = KeywordType(Name.mediaColor)
        /**
         * "media-front-coating" member type.
         * May contain any keyword from [MediaBackCoating] or a name.
         */
        @JvmField val mediaFrontCoating = KeywordType(Name.mediaFrontCoating)
        /**
         * "media-grain" member type.
         * May contain any keyword from [MediaGrain] or a name.
         */
        @JvmField val mediaGrain = KeywordType(Name.mediaGrain)
        /**
         * "media-hole-count" member type.
         */
        @JvmField val mediaHoleCount = IntType(Name.mediaHoleCount)
        /**
         * "media-info" member type.
         */
        @JvmField val mediaInfo = TextType(Name.mediaInfo)
        /**
         * "media-key" member type.
         * May contain any keyword from [Media] or a name.
         */
        @JvmField val mediaKey = KeywordType(Name.mediaKey)
        /**
         * "media-left-margin" member type.
         */
        @JvmField val mediaLeftMargin = IntType(Name.mediaLeftMargin)
        /**
         * "media-order-count" member type.
         */
        @JvmField val mediaOrderCount = IntType(Name.mediaOrderCount)
        /**
         * "media-pre-printed" member type.
         * May contain any keyword from [MediaPrePrinted] or a name.
         */
        @JvmField val mediaPrePrinted = KeywordType(Name.mediaPrePrinted)
        /**
         * "media-recycled" member type.
         * May contain any keyword from [MediaRecycled] or a name.
         */
        @JvmField val mediaRecycled = KeywordType(Name.mediaRecycled)
        /**
         * "media-right-margin" member type.
         */
        @JvmField val mediaRightMargin = IntType(Name.mediaRightMargin)
        /**
         * "media-size" member type.
         */
        @JvmField val mediaSize = MediaSize.Type(Name.mediaSize)
        /**
         * "media-size-name" member type.
         * May contain any keyword from [Media] or a name.
         */
        @JvmField val mediaSizeName = KeywordType(Name.mediaSizeName)
        /**
         * "media-source" member type.
         * May contain any keyword from [MediaSource] or a name.
         */
        @JvmField val mediaSource = KeywordType(Name.mediaSource)
        /**
         * "media-source-properties" member type.
         */
        @JvmField val mediaSourceProperties = MediaSourceProperties.Type(Name.mediaSourceProperties)
        /**
         * "media-thickness" member type.
         */
        @JvmField val mediaThickness = IntType(Name.mediaThickness)
        /**
         * "media-tooth" member type.
         * May contain any keyword from [MediaTooth] or a name.
         */
        @JvmField val mediaTooth = KeywordType(Name.mediaTooth)
        /**
         * "media-top-margin" member type.
         */
        @JvmField val mediaTopMargin = IntType(Name.mediaTopMargin)
        /**
         * "media-type" member type.
         * May contain any keyword from [MediaType] or a name.
         */
        @JvmField val mediaType = KeywordType(Name.mediaType)
        /**
         * "media-weight-metric" member type.
         */
        @JvmField val mediaWeightMetric = IntType(Name.mediaWeightMetric)
    }

    /**
     * Data object corresponding to a "media-size" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSize
    @JvmOverloads constructor(
        val xDimension: Int? = null,
        val yDimension: Int? = null,
        /** Encoded form, if known. */
        val _encoded: List<Attribute<*>>? = null
    ) : AttributeCollection {

        /** Produce an attribute list from members, or return the original [_encoded] attribute list if present. */
        override val attributes: List<Attribute<*>> by lazy {
            _encoded ?: listOfNotNull(
                xDimension?.let { Members.xDimension.of(it) },
                yDimension?.let { Members.yDimension.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<MediaSize>(Members)

        /** All member names as strings. */
        object Name {
            /** "x-dimension" member name */
            const val xDimension = "x-dimension"
            /** "y-dimension" member name */
            const val yDimension = "y-dimension"
        }

        /** Builder for immutable [MediaSize] objects. */
        class Builder() {
            /** Constructs a new [Builder] pre-initialized with values in [source]. */
            constructor(source: MediaSize) : this() {
                xDimension = source.xDimension
                yDimension = source.yDimension
            }
            var xDimension: Int? = null
            var yDimension: Int? = null

            /** Return a new [MediaSize] object containing all values initialized in this builder. */
            fun build() = MediaSize(
                xDimension,
                yDimension
            )
        }

        companion object Members : AttributeCollection.Converter<MediaSize> {
            override fun convert(attributes: List<Attribute<*>>): MediaSize =
                MediaSize(
                    extractOne(attributes, xDimension),
                    extractOne(attributes, yDimension),
                    _encoded = attributes)
            /**
             * "x-dimension" member type.
             */
            @JvmField val xDimension = IntType(Name.xDimension)
            /**
             * "y-dimension" member type.
             */
            @JvmField val yDimension = IntType(Name.yDimension)
        }
    }

    /**
     * Data object corresponding to a "media-source-properties" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSourceProperties
    @JvmOverloads constructor(
        /** May contain any keyword from [FeedOrientation]. */
        val mediaSourceFeedDirection: String? = null,
        val mediaSourceFeedOrientation: Orientation? = null,
        /** Encoded form, if known. */
        val _encoded: List<Attribute<*>>? = null
    ) : AttributeCollection {

        /** Produce an attribute list from members, or return the original [_encoded] attribute list if present. */
        override val attributes: List<Attribute<*>> by lazy {
            _encoded ?: listOfNotNull(
                mediaSourceFeedDirection?.let { Members.mediaSourceFeedDirection.of(it) },
                mediaSourceFeedOrientation?.let { Members.mediaSourceFeedOrientation.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<MediaSourceProperties>(Members)

        /** All member names as strings. */
        object Name {
            /** "media-source-feed-direction" member name */
            const val mediaSourceFeedDirection = "media-source-feed-direction"
            /** "media-source-feed-orientation" member name */
            const val mediaSourceFeedOrientation = "media-source-feed-orientation"
        }

        /** Builder for immutable [MediaSourceProperties] objects. */
        class Builder() {
            /** Constructs a new [Builder] pre-initialized with values in [source]. */
            constructor(source: MediaSourceProperties) : this() {
                mediaSourceFeedDirection = source.mediaSourceFeedDirection
                mediaSourceFeedOrientation = source.mediaSourceFeedOrientation
            }
            /** May contain any keyword from [FeedOrientation]. */
            var mediaSourceFeedDirection: String? = null
            var mediaSourceFeedOrientation: Orientation? = null

            /** Return a new [MediaSourceProperties] object containing all values initialized in this builder. */
            fun build() = MediaSourceProperties(
                mediaSourceFeedDirection,
                mediaSourceFeedOrientation
            )
        }

        companion object Members : AttributeCollection.Converter<MediaSourceProperties> {
            override fun convert(attributes: List<Attribute<*>>): MediaSourceProperties =
                MediaSourceProperties(
                    extractOne(attributes, mediaSourceFeedDirection),
                    extractOne(attributes, mediaSourceFeedOrientation),
                    _encoded = attributes)
            /**
             * "media-source-feed-direction" member type.
             * May contain any keyword from [FeedOrientation].
             */
            @JvmField val mediaSourceFeedDirection = KeywordType(Name.mediaSourceFeedDirection)
            /**
             * "media-source-feed-orientation" member type.
             */
            @JvmField val mediaSourceFeedOrientation = Orientation.Type(Name.mediaSourceFeedOrientation)
        }
    }
}
