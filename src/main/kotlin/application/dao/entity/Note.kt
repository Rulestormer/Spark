package application.dao.entity

import java.time.LocalDate

data class Note(val id: Int,
                var name: String,
                var description: String,
                val dueDate: LocalDate)