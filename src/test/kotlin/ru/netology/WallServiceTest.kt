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

    @Test
    fun createComment_true() {
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
        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 2,
                date = 45453432,
                text = "Comment for Second post with id = 2"
        )

        // выполняем целевое действие
        val result = service.createComment(comment)

        // проверяем результат
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
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
        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 777,
                date = 45453432,
                text = "Comment for Nothing post "
        )

        // выполняем целевое действие
        service.createComment(comment)
    }

    @Test
    fun reportComment_true() {
        // создаём целевой сервис
        val service = WallService()

        // создаем пост
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

        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 1,
                date = 45453432,
                text = "Comment for First post with id = 1"
        )
        service.createComment(comment)

        // создаем жалобу
        val report = Report(
                ownerId = 1,
                commentId = 22,
                reason = 0
        )

        // выполняем целевое действие
        val result = service.reportComment(report)

        // проверяем результат
        assertEquals(1, result)
    }

    @Test(expected = CommentNotFoundException::class)
    fun shouldThrow_CommentNotFoundException() {
        // создаём целевой сервис
        val service = WallService()

        // создаем пост
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

        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 1,
                date = 45453432,
                text = "Comment for First post with id = 1"
        )
        service.createComment(comment)

        // создаем жалобу
        val report = Report(
                ownerId = 1,
                commentId = 10,
                reason = 0
        )

        // выполняем целевое действие
        service.reportComment(report)
    }

    @Test(expected = ReasonNotFoundException::class)
    fun shouldThrow_ReasonNotFoundExceptionMoreBorder() {
        // создаём целевой сервис
        val service = WallService()

        // создаем пост
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

        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 1,
                date = 45453432,
                text = "Comment for First post with id = 1"
        )
        service.createComment(comment)

        // создаем жалобу
        val report = Report(
                ownerId = 1,
                commentId = 22,
                reason = 10
        )

        // выполняем целевое действие
        service.reportComment(report)
    }

    @Test(expected = ReasonNotFoundException::class)
    fun shouldThrow_ReasonNotFoundExceptionLessBorder() {
        // создаём целевой сервис
        val service = WallService()

        // создаем пост
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

        // создаём комментарий к посту
        val comment = Comment(
                id = 22,
                fromId = 456,
                postId = 1,
                date = 45453432,
                text = "Comment for First post with id = 1"
        )
        service.createComment(comment)

        // создаем жалобу
        val report = Report(
                ownerId = 1,
                commentId = 22,
                reason = -10
        )

        // выполняем целевое действие
        service.reportComment(report)
    }
}