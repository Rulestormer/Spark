package application.controller

import application.service.impl.UserService
import com.google.gson.Gson
import spark.Spark.path
import spark.kotlin.after
import spark.kotlin.get

class UserController {
    private val userService = UserService()
    private val gson = Gson()

    fun init(){
        path("/user") {
            get("") {
                gson.toJson(userService.getAllUsers())
            }
        }
        after {
            response.type("application/json")
        }
    }
}