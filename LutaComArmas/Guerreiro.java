package LutaComArmas;

public class Guerreiro{
    private String nome;
    private Armas arma;
    
    public Guerreiro(String nome, Armas arma){
        this.nome = nome;
        this.arma = arma;
    }

    public String getNome(){
        return nome;
    }

    public String getArma(){
        return "Sua arma é " + arma;
    }

    public int golpe(){
        return arma.getDano();
    }



}
