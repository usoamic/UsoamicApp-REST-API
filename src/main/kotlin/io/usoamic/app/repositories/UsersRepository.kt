package io.usoamic.app.repositories

import io.usoamic.app.models.db.UsersDbEntity
import org.springframework.data.repository.CrudRepository

interface UsersRepository : CrudRepository<UsersDbEntity, String>
