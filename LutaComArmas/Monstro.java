package LutaComArmas;

public class Monstro {
    private String nome;
    private int vida;

    public Monstro(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public String danoRecebido(int dano){
        return "O monstro recebeu " + dano + " sua vida é de " + (vida - dano);
    }
}
