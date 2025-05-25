package com.clube;
import java.util.ArrayList;

class Meeting {
    private String date;
    private String theme;
    
    private ArrayList<Member> members;
    private ArrayList<Book> discussedBooks;

    public Meeting (String date, String theme){
        this.date = date;
        this.theme = theme;
        this.members = new ArrayList <>();
        this.discussedBooks = new ArrayList <>();
    }

    public void registerMember (Member member){
        members.add(member);
    }

    public void addBook (Book book){
        discussedBooks.add(book);
    }

    public String getDate(){ 
        return date; 
    }
    public String getTheme(){ 
        return theme;
    }
    public ArrayList<Member> getMembers(){
        return members;
    }
    public ArrayList<Book> getDiscussedBooks(){
        return discussedBooks;
    }
}