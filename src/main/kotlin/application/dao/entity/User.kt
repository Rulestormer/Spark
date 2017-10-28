package application.dao.entity

import kotlin.Int

data class User(val id: Int,
                val firstName: String,
                val lastName: String,
                val books: ArrayList<NoteBook>?)