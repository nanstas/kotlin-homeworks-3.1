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
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
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
                text = "First post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1
        )
        service.add(post1)
        val post2 = Post(
                id = 2,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Second post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1
        )
        service.add(post2)
        // создаём информацию об обновлении
        val update = Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "The newest first post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
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
                text = "First post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1
        )
        service.add(post1)
        val post2 = Post(
                id = 2,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Second post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1
        )
        service.add(post2)
        // создаём информацию об обновлении
        val update = Post(
                id = 3,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "The newest first post",
                replyOwnerId = 1,
                replyPostId = 1,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}