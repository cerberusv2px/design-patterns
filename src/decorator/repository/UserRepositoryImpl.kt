package decorator.repository

import decorator.model.User
import utils.DBConnections

class UserRepositoryImpl : UserRepository {

    private var conn = DBConnections()

    override fun getAll(): List<User> {
        conn.open()
        val sql = "SELECT * FROM users"
        conn.initStatement(sql)
        val result = conn.executeQuery()
        val userList: MutableList<User> = mutableListOf()
        while (result.next()) {
            userList.add(
                User(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getString("adderss")
                )
            )
        }
        conn.close()
        return userList
    }

    override fun insert(user: User) {

        val sql = "INSERT INTO users VALUES (?,?,?)"
        conn.open()
        val stmt = conn.initStatement(sql)
        stmt.setInt(1, user.id)
        stmt.setString(2, user.name)
        stmt.setString(3, user.address)
        conn.executeUpdate()
        conn.close()
    }
}