package ru.netology

data class DocAttachment(
        override val type: String = "doc",
        val doc: Doc
) : Attachments