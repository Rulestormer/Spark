package application.dao.entity

import java.time.LocalDateTime

data class NoteBook(val id: Int,
                    val name: String,
                    val description: String,
                    val created: LocalDateTime,
                    val notes: ArrayList<Note>)