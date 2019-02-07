package decorator.repository

import decorator.model.User
import utils.DBConnections

class AdminUserDecorator(userRepository: UserRepository) : UserDecorator(userRepository) {

    private val conn = DBConnections()

    override fun getAll(): List<User> {
        return super.getAll()
    }

    override fun insert(user: User) {
        super.insert(user)
    }

    override fun updateUser(user: User) {
        // TODO: Update user
    }

    override fun deleteUser(id: Int) {
        // TODO: Delete user
    }
}