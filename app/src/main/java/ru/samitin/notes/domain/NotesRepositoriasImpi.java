package ru.samitin.notes.domain;

import java.util.ArrayList;
import java.util.List;
import ru.samitin.notes.R;

import android.content.Context;
import android.content.res.Resources;

public class NotesRepositoriasImpi {
    private String[]names;
    private String[]descriptions;
    private String[]dates;
    private String[]notesItSelf;
    public NotesRepositoriasImpi(Resources res){
        names=res.getStringArray(R.array.notesName);
        descriptions=res.getStringArray(R.array.descriptions);
        dates=res.getStringArray(R.array.date);
        notesItSelf=res.getStringArray(R.array.notes);
    }

    public List<Note>getNotes(){

        ArrayList<Note>notes=new ArrayList<Note>();
        for (int i=0;i<names.length;i++)
        notes.add(new Note(names[i],descriptions[i],dates[i],notesItSelf[i]));
        return notes;
    }
    public String[]getNotesNames(){
        return names;
    }
}
