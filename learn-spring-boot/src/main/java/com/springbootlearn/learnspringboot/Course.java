package com.springbootlearn.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String author;
    
    //Constructor
    public Course(long id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getID(){
        return id;
    }

    public String name(){
        return name;
    }

    public String author(){
        return author;
    }

    @Override
    public String toString(){
        return "Course [id = " + id + ", name = " + name + ", author + " + author + "]";
    }
}
