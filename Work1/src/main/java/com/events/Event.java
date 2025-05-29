package com.events;

import java.util.Iterator;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Event{
    private String title;
    private String location;
    private String description;
    private int capacity;
    private LocalDate date;
    private ArrayList<Participant> participants = new ArrayList<>();

    public Event(String title, String location, String description, int capacity, LocalDate date){
        this.title = title;
        this.location = location;
        this.description = description;
        this.capacity = capacity;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }
    public String getLocation(){
        return location;
    }
    public String getDescription(){
        return description;
    }
    public int getCapacity(){
        return capacity;
    }
    public LocalDate getDate(){
        return date;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    } 
    public void setDaTe(LocalDate date){
        this.date = date;
    }

    public boolean registerParticipant (Participant participant){
        if(participants.size() < capacity){
            participants.add(participant);
            return true;
        }
        return false
    }

    public abstract String Certificate(Participant participant);
}

class Lecture extends Event{
    public Lecture (String title, String location, String description, int capacity, LocalDate date){
        super(title, location, description, capacity, date);
    }

    @Override
    public String Certificate(Participant participant){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = getDate.format(formatter);
        return "=================================\n" +
               "           CERTIFICATE           \n" +
               "=================================\n" +
               "Lecture Topic: " + getTitle() + "\n" +
               "Participant: " + getName() + "\n" +
               "Date: " + getDate() +"\n" +
               "=================================\n"
    }

    @Override
    public boolean registerParticipant(Participant participant){
        if (participant instanceof Student){
            return super.registerParticipant(participant);
        }
        return false
    }
}