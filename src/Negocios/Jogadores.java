package Negocios;

public class Jogadores implements java.io.Serializable{
    private String nome;
    private int score;
    
    public Jogadores(String nome,int score){
        this.nome=nome;
        this.score=score;
    }
    
    public Jogadores(){        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
