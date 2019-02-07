package decorator

import decorator.model.User
import decorator.repository.AdminUserDecorator
import decorator.repository.UserRepositoryImpl

fun main() {

    val userRepositoryImpl = UserRepositoryImpl()
    // getAll(userRepositoryImpl)

    val adminUserRepoImpl = AdminUserDecorator(userRepositoryImpl)
    adminUserRepoImpl.insert(User(2, "Test", "Test"))
}

private fun insertUser(userRepo: UserRepositoryImpl) {
    val user = User(1, "Sujin", "KTM")
    userRepo.insert(user)
}

private fun getAll(userRepo: UserRepositoryImpl) {
    println(userRepo.getAll())
}