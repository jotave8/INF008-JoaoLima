package com.events;

abstract class Participant{
    private String name;
    private String email;

    public Participant(String name, String email){
        this.name = name;
        this.email = email;
    } 

    public String getName(){    
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
}

public class Student extends Participant{
    private int studentId;

    public Student(String name, String email, int studentId){
        super(name,email);
        this.studentId = studentId;
    }
}

public class Teacher extends Participant{
    private int teacherId;

    public Teacher(String name, String email, int teacherId){
        super(name, email);
        this.teacherId;
    }
}