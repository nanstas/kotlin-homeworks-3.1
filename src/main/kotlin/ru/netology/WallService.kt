package ru.netology

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) post.copy(idInPosts = 1) else post.copy(idInPosts = posts.last().idInPosts + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val indexPostUpdates = posts.indexOf(post)
        return if (indexPostUpdates != -1) {
            posts[indexPostUpdates] = post.copy(ownerId = posts[indexPostUpdates].ownerId, date = posts[indexPostUpdates].date)
            true
        } else {
            false
        }
    }
}