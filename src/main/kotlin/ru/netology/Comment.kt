package ru.netology

data class Comment(
        val id: Int,
        val fromId: Int,
        val postId: Int,
        val date: Int,
        val text: String,
        val replayToUser: Int,
        val replayToComment: Int,
        val attachments: Attachments,
        val parentsStack: Array<Int>,
        val thread: Thread
)
