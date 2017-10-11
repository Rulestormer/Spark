package application
import application.controller.UserController
import spark.kotlin.*

class ServiceRunner {

    fun run(){
        port(9000)
        initControllers()
    }

    private fun initControllers() {
        UserController().init()
    }

}
