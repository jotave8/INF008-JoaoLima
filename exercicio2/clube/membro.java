import java.util.ArrayList;

class Membro{
    private String nome;
    private int id;
    private String email;
    private static userID =0;
    private ArrayList<Livro> historicoLeitura;

    public Membro(int id){
        this.id = userID++;
        this.historicoLeitura = new ArrayList<>();
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

    public getEmail (String email){
        return email;
    }

    public setEmail (String email){
        this.email = email;
    }

}