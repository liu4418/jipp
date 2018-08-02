// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport", "MagicNumber")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Attribute types for the Subscription Template group.
 */
object SubscriptionTemplateGroup {

    /**
     * "notify-attributes" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyAttributes = KeywordType("notify-attributes")

    /**
     * "notify-charset" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyCharset = StringType(Tag.charset, "notify-charset")

    /**
     * "notify-events" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     * May contain any keyword from [NotifyEvent].
     */
    @JvmField val notifyEvents = KeywordType("notify-events")

    /**
     * "notify-lease-duration" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyLeaseDuration = IntType("notify-lease-duration")

    /**
     * "notify-max-events-supported" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyMaxEventsSupported = IntType("notify-max-events-supported")

    /**
     * "notify-natural-language" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyNaturalLanguage = StringType(Tag.naturalLanguage, "notify-natural-language")

    /**
     * "notify-pull-method" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     * May contain any keyword from [NotifyPullMethod].
     */
    @JvmField val notifyPullMethod = KeywordType("notify-pull-method")

    /**
     * "notify-recipient-uri" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyRecipientUri = UriType("notify-recipient-uri")

    /**
     * "notify-time-interval" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyTimeInterval = IntType("notify-time-interval")

    /**
     * "notify-user-data" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyUserData = OctetsType("notify-user-data")
}
