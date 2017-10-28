package application.controller

import application.service.impl.NoteService
import com.google.gson.Gson
import spark.Spark.path
import spark.kotlin.after
import spark.kotlin.get

class NoteController {
    private val gson = Gson()
    private val noteService = NoteService()

    fun init(){
        path("/note") {
            get("/book") {
                gson.toJson(noteService.getNotesByBook())
            }
        }
        after {
            response.type("application/json")
        }
    }
}