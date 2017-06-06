package com.hp.jipp.util

import java.util.ArrayList
import java.util.Stack

/**
 * Builds pretty-printed output from structured data
 *
 * @param prefix prefix to appear before items
 * @param style display for items added
 * @param indent a single level of indent
 * @param maxWidth maximum width of a line before forcing grouped items each onto their own line
 */
class PrettyPrinter internal constructor(prefix: String, style: Style, private val mIndent: String,
                                   private val mMaxWidth: Int) {
    /** An object that knows how to pretty-print itself  */
    interface Printable {
        /** Add a representation of self to the printer  */
        fun print(printer: PrettyPrinter)
    }

    private val mGroups = Stack<Group>()

    init {
        // Push a root group
        mGroups.push(Group(SILENT, "", mMaxWidth))
        // Push the user's initial group (closed by print())
        mGroups.push(Group(style, prefix, mMaxWidth))
    }

    /**
     * Open a new pretty-printed group of the specified style and prefix. Any items added will be appended to this
     * group, until [.close] is called.
     */
    @JvmOverloads fun open(style: Style, prefix: String = ""): PrettyPrinter {
        mGroups.push(Group(style, prefix, mMaxWidth))
        return this
    }

    /**
     * Close the current group, falling back to the parent group. Any new items added will appear in the previously
     * opened group.
     */
    fun close(): PrettyPrinter {
        if (mGroups.size < 3) throw IllegalArgumentException("nothing open to close")
        if (mGroups.size < 2) throw IllegalArgumentException("close after print")
        innerClose()
        return this
    }

    private fun innerClose() {
        val closed = mGroups.pop()
        val startPos = mGroups.size * (mIndent.length - 1)
        if (startPos + closed.width() < mMaxWidth) {
            innerAdd(closed.compressed())
        } else {
            innerAdd(closed.expanded(startPos, String(CharArray(mGroups.size)).replace("\u0000", mIndent)))
        }
    }

    /**
     * Add items to the current group
     */
    fun addAll(items: Collection<Any>): PrettyPrinter {
        if (mGroups.size < 2) throw IllegalArgumentException("print already called")
        for (item in items) {
            innerAdd(item)
        }
        return this
    }

    /**
     * Add items to the current group
     */
    fun add(vararg items: Any): PrettyPrinter {
        if (mGroups.size < 2) throw IllegalArgumentException("print already called")
        for (item in items) {
            innerAdd(item)
        }
        return this
    }

    private fun innerAdd(item: Any) {
        val group = mGroups.peek()
        if (item is Printable) {
            item.print(this)
        } else {
            group.items.add(item)
        }
    }

    /**
     * Closes all open groups and builds a result. After making this call, no more items or groups can be added
     */
    fun print(): String {
        while (mGroups.size > 1) innerClose()
        return mGroups.peek().items[0].toString()
    }

    companion object {
        private val NEWLINE = "\n"

        /** A style for arrays, e.g. "Me [ A, B, C ]"  */
        @JvmField val ARRAY = Style("[", "]", ",", " ")

        /** A style for objects, e.g. "Me { A, B, C }"  */
        @JvmField val OBJECT = Style("{", "}", ",", " ")

        /** A style for key/value pairs e.g. "Me A/B/C". Works best when there is only one value.  */
        @JvmField val KEY_VALUE = Style(" ", "", "/", "")

        /** A style used internally for the root group  */
        private val SILENT = Style("", "", ",", "")

        /** Style used for delimiting members of a pretty-printed group  */
        class Style internal constructor(val opener: String, val closer: String,
                                         val separator: String, val spacer: String)

        /** A group of objects currently being pretty-printed  */
        internal class Group internal constructor(private val style: Style, private val prefix: String,
                                                  private val maxWidth: Int) {

            val items = ArrayList<Any>()

            internal fun width(): Int {
                var result = 0
                if (!prefix.isEmpty()) {
                    result += prefix.length + style.spacer.length
                }
                result += style.opener.length + style.spacer.length
                for (item in items) {
                    result += item.toString().length
                }
                result += (items.size - 1) * style.separator.length + style.spacer.length
                result += style.spacer.length + style.closer.length
                return result
            }

            internal fun compressed(): String {
                val out = StringBuilder()
                if (!prefix.isEmpty()) {
                    out.append(prefix)
                    out.append(style.spacer)
                }
                out.append(style.opener)
                out.append(style.spacer)
                out.append(Strings.join(style.separator + style.spacer, items))
                out.append(style.spacer)
                out.append(style.closer)
                return out.toString()
            }

            internal fun expanded(startPos: Int, indent: String): String {
                val out = StringBuilder()
                if (!prefix.isEmpty()) {
                    out.append(prefix)
                    out.append(style.spacer)
                }
                out.append(style.opener)

                // If all contained items are relatively short, use a semi-expanded form
                var compact = true
                for (item in items) {
                    if (item.toString().length > maxWidth / 3) {
                        compact = false
                        break
                    }
                }

                if (compact) {
                    out.append(style.spacer)
                    var curWidth = startPos + out.length
                    for (i in items.indices) {
                        val itemString = items[i].toString()
                        if (i > 0) {
                            val expectedWidth = style.separator.length + style.spacer.length + itemString.length
                            if (curWidth + expectedWidth > maxWidth) {
                                out.append(style.separator)
                                out.append(NEWLINE)
                                out.append(indent)
                                out.append(itemString)
                                curWidth = indent.length + itemString.length
                            } else {
                                out.append(style.separator)
                                out.append(style.spacer)
                                out.append(itemString)
                                curWidth += style.separator.length
                                curWidth += style.spacer.length
                                curWidth += itemString.length
                            }
                        } else {
                            out.append(itemString)
                            curWidth += itemString.length
                        }
                    }
                } else {
                    out.append(NEWLINE)
                    out.append(indent)
                    out.append(Strings.join(style.separator + NEWLINE + indent, items))
                }
                out.append(style.spacer)
                out.append(style.closer)
                return out.toString()
            }
        }
    }
}
