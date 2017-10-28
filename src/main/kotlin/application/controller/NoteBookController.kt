package application.controller

import spark.kotlin.get

class NoteBookController {

    fun init(){
        get("/notebook/"){"Hello World!"}
    }

}