package application.service.impl

import application.dao.entity.Note
import application.service.INoteService
import java.time.LocalDate

class NoteService : INoteService {
    fun getNotesByBook(): Collection<Note> {
        val notes = ArrayList<Note>()
        notes.add(Note(1, "Assignments", "Contains my assignments at uni", LocalDate.now()))
        return notes
    }
}