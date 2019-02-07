package decorator.repository

import decorator.model.User

abstract class UserDecorator(protected val userRepository: UserRepository) : UserRepository {

    override fun getAll(): List<User> {
        return userRepository.getAll()
    }

    override fun insert(user: User) {
        userRepository.insert(user)
    }

    abstract fun updateUser(user: User)
    abstract fun deleteUser(id: Int)
}