package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        // создаём целевой сервис
        val service = WallService()

        // создаем и сразу добавляем в посты
        val addedPost = service.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "First post",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                copyright = "1",
                likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
                reposts = Reposts(count = 1, userReposted = true),
                views = Views(count = 1),
                postType = "1",
                signerId = 1,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 1
            )
        )

        val result = addedPost.idInPosts > 0

        // проверяем результат
        assertTrue(result)
    }

    @Test
    fun update_objectFound() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        val post1 = Post(
            id = 1,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "Undefined post",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "1",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "1",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 1
        )
        service.add(post1)
        val post2 = Post(
            id = 2,
            ownerId = 2,
            fromId = 2,
            createdBy = 2,
            date = 2,
            text = "Second post",
            replyOwnerId = 2,
            replyPostId = 2,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "2",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "2",
            signerId = 2,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 2
        )
        service.add(post2)
        // создаём информацию об обновлении
        val update = Post(
            id = 1,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "First post",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "1",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "1",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 1
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun update_objectNotFound() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        val post1 = Post(
            id = 1,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "Undefined post",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "1",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "1",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 1
        )
        service.add(post1)
        val post2 = Post(
            id = 2,
            ownerId = 2,
            fromId = 2,
            createdBy = 2,
            date = 2,
            text = "Second post",
            replyOwnerId = 2,
            replyPostId = 2,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "2",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "2",
            signerId = 2,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 2
        )
        service.add(post2)
        // создаём информацию об обновлении
        val update = Post(
            id = 3,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "First post",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(count = 1, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            copyright = "1",
            likes = Likes(count = 0, userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts(count = 1, userReposted = true),
            views = Views(count = 1),
            postType = "1",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 1
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}