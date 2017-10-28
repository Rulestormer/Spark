package application.service.impl

import application.dao.entity.User
import application.service.IUserService

class UserService : IUserService {
    fun getAllUsers(): Collection<User> {
        val users = ArrayList<User>()
        users.add(User(1, "Oliver", "Nagel", null))
        return users
    }
}