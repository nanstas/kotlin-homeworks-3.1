package ru.netology

data class Post(
        val id: Int,
        val ownerId: Int,
        val fromId: Int,
        val createdBy: Int,
        val date: Int,
        val text: String,
        val replyOwnerId: Int,
        val replyPostId: Int,
        val friendsOnly: Boolean = false,
        val comments: Comments?,
        val copyright: String,
        val likes: Likes?,
        val reposts: Reposts?,
        val views: Views?,
        val postType: String = "post",
        val postSource: PostSource?,
        val attachments: Array<Attachments>?,
        val geo: Geo?,
        val signerId: Int,
        val copyHistory: Array<Post>?,
        val canPin: Boolean = false,
        val canDelete: Boolean = false,
        val canEdit: Boolean = false,
        val isPinned: Boolean = false,
        val markedAsAds: Boolean = false,
        val isFavorite: Boolean = false,
        val postponedId: Int,
        val idInPosts: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}