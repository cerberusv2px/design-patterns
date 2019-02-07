package decorator.repository

import decorator.model.User

interface UserRepository {

    fun getAll(): List<User>
    fun insert(user: User)
}