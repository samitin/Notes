package ru.samitin.notes.domain;



public class Note {

    private String name;
    private String description;
    private String date;
    private String noteItSelf;

    public Note(String name,String description,String date,String noteItSelf){
        this.name=name;
        this.description=description;
        this.date=date;
        this.noteItSelf=noteItSelf;
    }
    public String getName(){ return name;}
    public String getDescription(){return description;}
    public String getDate(){return date;}
    public String getNoteItSelf(){return noteItSelf;};
}
