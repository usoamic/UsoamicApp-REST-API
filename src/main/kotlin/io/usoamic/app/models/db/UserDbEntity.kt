package io.usoamic.app.models.db

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users", schema = "usoamicapp", catalog = "usoamicapp-db")
open class UserDbEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", unique = true, nullable = false)
    open var userId: UUID? = null

    @Basic
    @Column(name = "wallet_name", nullable = false)
    open var walletName: String? = null

    @Basic
    @Column(name = "phone_number", nullable = false)
    open var phoneNumber: String? = null

    @Basic
    @get:Column(name = "chat_id", nullable = false)
    open var chatId: String? = null

    @get:Basic
    @get:Column(name = "created_at", nullable = true)
    open var createdAt: java.sql.Timestamp? = null


    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "userId = $userId " +
                "walletName = $walletName " +
                "phoneNumber = $phoneNumber " +
                "chatId = $chatId " +
                "createdAt = $createdAt " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UserDbEntity

        if (userId != other.userId) return false
        if (walletName != other.walletName) return false
        if (phoneNumber != other.phoneNumber) return false
        if (chatId != other.chatId) return false
        if (createdAt != other.createdAt) return false

        return true
    }

}

