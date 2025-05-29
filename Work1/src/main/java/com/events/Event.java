package com.events;

import java.util.Iterator;
import java.util.ArrayList;
import java.time.LocalDateTime;

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
}