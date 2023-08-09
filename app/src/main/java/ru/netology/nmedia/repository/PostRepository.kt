package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post

interface PostRepository {
    /* часть исходного варианта
    fun getAll(): List<Post>
    fun likeById(id: Long)
    fun save(post: Post)
    fun removeById(id: Long)
    */

    //через общий интерфейс
    fun getAllAsync(callback: RepositoryCallback<List<Post>>)
    fun likeByIdAsync(id: Long, likedByMe: Boolean, callback: RepositoryCallback<Post>)
    fun saveAsync(post: Post, callback: RepositoryCallback<Unit>)
    fun removeByIdAsync(id: Long, callback: RepositoryCallback<Unit>)

    interface RepositoryCallback<T> {
        fun onSuccess(value: T) {}
        fun onError(e: Exception) {}
    }



    /* с помощью интерфейса для каждой функции
    fun getAllAsync(callback: GetAllCallback)
    fun likeByIdAsync(callback: likeByIdCallback)
    fun saveAsync(callback: saveCallback)
    fun removeByIdAsync(callback: removeByIdCallback)

    interface GetAllCallback {
        fun onSuccess(posts: List<Post>) {}
        fun onError(e: Exception) {}
    }

    interface likeByIdCallback {
        fun onSuccess(posts: Post) {}
        fun onError(e: Exception) {}
    }

    interface saveCallback {
        fun onSuccess() {}
        fun onError(e: Exception) {}
    }

    interface removeByIdCallback {
        fun onSuccess() {}
        fun onError(e: Exception) {}
    }
    */

}
