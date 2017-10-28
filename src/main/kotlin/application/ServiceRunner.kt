package application
import application.controller.NoteBookController
import application.controller.NoteController
import application.controller.UserController
import spark.kotlin.*

class ServiceRunner {

    fun run(){
        port(9000)
        initControllers()
    }

    private fun initControllers() {
        NoteBookController().init()
        NoteController().init()
        UserController().init()
    }

}
