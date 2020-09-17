package ru.netology

data class LinkAttachment(
        override val type: String = "link",
        val link: Link
) : Attachments