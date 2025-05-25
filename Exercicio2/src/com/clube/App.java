package com.clube;

public class App{
    public static void main(String[] args) {
        ReadingClub club = new ReadingClub();
        
        Member member1 = new Member("Marcelo", "Ribeira", "27/09/1996");
        Member member2 = new Member("Roberta", "Barra", "14/05/1999");
        
        Book book1 = new Book("Dom Casmurro", "Machado de Assis", 1899);
        
        club.addMember(member1);
        club.addMember(member2);
        club.addBook(book1);
        
        member1.recommendBook(book1);
        member2.recommendBook(book1);
        
        Meeting meeting = new Meeting("19/05/2025", "Realismo Brasileiro");
        meeting.registerMember(member1);
        meeting.registerMember(member2);
        meeting.addBook(book1);
        club.addMeeting(meeting);
        
        Book top = club.mostRecommendedBook();

        System.out.println("Livro mais recomendado: " + top.getTitle());
        System.out.println("Data: " + meeting.getDate());
        System.out.println("Tema: " + meeting.getTheme());
        System.out.print("Participantes: " );
        
        for (Member m : meeting.getMembers()) {
            System.out.print(m.getName() + ", "); 
        }
        System.out.print("\nLivro discutido: ");
        for (Book book : meeting.getDiscussedBooks()) {
            System.out.print(book.getTitle() + ", ");
        }
        
    }
}