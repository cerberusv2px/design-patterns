package utils

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet

class DBConnections {

    private lateinit var conn: Connection
    private lateinit var stmt: PreparedStatement

    fun open() {
        Class.forName("org.postgresql.Driver")
        conn =
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "sujin.v2px", "")
    }

    fun initStatement(sql: String): PreparedStatement {
        stmt = conn.prepareStatement(sql)
        return stmt
    }

    fun executeUpdate(): Int = stmt.executeUpdate()

    fun executeQuery(): ResultSet = stmt.executeQuery()

    fun close() {
        conn.close()
    }
}