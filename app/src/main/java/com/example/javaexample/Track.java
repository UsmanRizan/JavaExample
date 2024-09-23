package com.example.javaexample;

public class Track {
    private String name;
    private String instructor;

    Track(String name,String instructor){
        this.instructor = instructor;
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getName() {
        return name;
    }
}
