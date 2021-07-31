package io.usoamic.app.models.db

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users", schema = "usoamicapp", catalog = "usoamicapp-db")
open class UsersDbEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", unique = true, nullable = false)
    open var userId: UUID? = null

    @Basic
    @Column(name = "private_key", nullable = false)
    open var privateKey: String? = null

    @Basic
    @Column(name = "phone", nullable = false)
    open var phone: String? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "userId = $userId " +
                "privateKey = $privateKey " +
                "phone = $phone " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UsersDbEntity

        if (userId != other.userId) return false
        if (privateKey != other.privateKey) return false
        if (phone != other.phone) return false

        return true
    }

}

