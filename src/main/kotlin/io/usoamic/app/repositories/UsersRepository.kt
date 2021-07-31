package io.usoamic.app.repositories

import io.usoamic.app.models.db.UserDbEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<UserDbEntity, String>
