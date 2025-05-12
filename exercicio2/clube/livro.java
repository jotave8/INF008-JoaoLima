class Livro{
    private String nome;
    private String autor;
    private String genero;
    private int id;
    private static int bookID = 0;

    public  Livro(int id){
        this.id = bookID++;
    }

    public getNome(){
        return nome;
    }

    public setNome(String nome){
        this.nome = nome;
    }

    public getId(int id){
        return id;
    }

    public getAutor (String autor){
        return autor;
    }

    public setAutor (String autor){
        this.autor = autor;
    }

}