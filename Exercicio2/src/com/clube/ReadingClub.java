package com.clube;
import java.util.ArrayList;
import java.util.Iterator;

class ReadingClub {
    private ArrayList<Member> members;
    private ArrayList<Book> books;
    private ArrayList<Meeting> meetings;

    public ReadingClub() {
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
        this.meetings = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public int numberOfMembers() {
        return members.size();
    }

    public Book mostRecommendedBook() {
        Book mostRecommended = null;
        int max = -1;
        
        Iterator<Book> iterator = books.iterator();
        
        while(iterator.hasNext()) {
            Book book = iterator.next();
            if(book.getRecommendations() > max) {
                max = book.getRecommendations();
                mostRecommended = book;
            } 
        }
        return mostRecommended;
    }
}
