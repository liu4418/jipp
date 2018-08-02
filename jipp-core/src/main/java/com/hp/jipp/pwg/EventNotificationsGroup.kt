// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport", "MagicNumber")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Attribute types for the Event Notifications group.
 */
object EventNotificationsGroup {

    /**
     * "job-id" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val jobId = IntType("job-id")

    /**
     * "job-impressions-completed" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val jobImpressionsCompleted = IntType("job-impressions-completed")

    /**
     * "job-state" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val jobState = JobState.Type("job-state")

    /**
     * "job-state-reasons" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     * May contain any keyword from [JobStateReason].
     */
    @JvmField val jobStateReasons = KeywordType("job-state-reasons")

    /**
     * "job-uuid" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf).
     */
    @JvmField val jobUuid = UriType("job-uuid")

    /**
     * "notify-charset" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifyCharset = StringType(Tag.charset, "notify-charset")

    /**
     * "notify-natural-language" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifyNaturalLanguage = StringType(Tag.naturalLanguage, "notify-natural-language")

    /**
     * "notify-printer-uri" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifyPrinterUri = UriType("notify-printer-uri")

    /**
     * "notify-sequence-number" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifySequenceNumber = IntType("notify-sequence-number")

    /**
     * "notify-subscribed-event" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     * May contain any keyword from [NotifyEvent].
     */
    @JvmField val notifySubscribedEvent = KeywordType("notify-subscribed-event")

    /**
     * "notify-subscription-id" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifySubscriptionId = IntType("notify-subscription-id")

    /**
     * "notify-subscription-uuid" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf).
     */
    @JvmField val notifySubscriptionUuid = UriType("notify-subscription-uuid")

    /**
     * "notify-text" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995).
     */
    @JvmField val notifyText = TextType("notify-text")

    /**
     * "notify-user-data" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val notifyUserData = OctetsType("notify-user-data")

    /**
     * "printer-current-time" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val printerCurrentTime = DateTimeType("printer-current-time")

    /**
     * "printer-is-accepting-jobs" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val printerIsAcceptingJobs = BooleanType("printer-is-accepting-jobs")

    /**
     * "printer-state" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val printerState = PrinterState.Type("printer-state")

    /**
     * "printer-state-reasons" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     * May contain any keyword from [PrinterStateReason].
     */
    @JvmField val printerStateReasons = KeywordType("printer-state-reasons")

    /**
     * "printer-up-time" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996).
     */
    @JvmField val printerUpTime = IntType("printer-up-time")
}
