package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) post.copy(idInPosts = 1) else post.copy(idInPosts = posts.last().idInPosts + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (p: Post in posts) {
            if (p.id == post.id) {
                val indexPostUpdates = posts.indexOf(p)
                posts[indexPostUpdates] = post.copy(ownerId = posts[indexPostUpdates].ownerId, date = posts[indexPostUpdates].date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        for (p: Post in posts) {
            if (p.id == comment.postId) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("no post with id ${comment.postId}")
    }
}