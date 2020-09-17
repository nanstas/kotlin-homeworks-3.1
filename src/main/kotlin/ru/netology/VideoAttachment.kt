package ru.netology

data class VideoAttachment(
        override val type: String = "video",
        val video: Video
) : Attachments