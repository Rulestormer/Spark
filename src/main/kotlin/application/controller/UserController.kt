package application.controller

import spark.kotlin.get

class UserController {

    fun init(){
        get("/"){"Hello World!"}
    }
}