package com.clube;
import java.util.ArrayList;

class Member{
    private String name;
    private int id;
    private String address;
    private String birthdate;
    private static int userID = 0;
    
    private ArrayList<Book> readBooks;
    private ArrayList<Book> recommendedBooks;

    public Member(String name, String address, String birthdate){
        this.id = userID++;
        this.readBooks = new ArrayList<>();
        this.recommendedBooks = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }

    public void recommendBook(Book book) {
        this.recommendedBooks.add(book); // Adiciona à lista de recomendados
        book.incrementRecommendation(); // Incrementa o contador no livro
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public String getAddress (){
        return this.address;
    }
    public String getBirthdate (){
        return this.birthdate;
    }
    public ArrayList<Book> getReadBooks(){ 
        return readBooks;
    }
    public ArrayList<Book> getRecommendedBooks(){ 
        return recommendedBooks; 
    }

    public void setAddress (String address){
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
}