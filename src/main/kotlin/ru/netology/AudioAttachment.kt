package ru.netology

data class AudioAttachment(
        override val type: String = "audio",
        val audio: Audio
) : Attachments