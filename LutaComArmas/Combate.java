package LutaComArmas;

public class Combate {
    Guerreiro guerreiro;
    Monstro monstro;

    public Combate(Guerreiro guerreiro, Monstro monstro){
        this.guerreiro = guerreiro;
        this.monstro = monstro;
    }

    public String mostroVida(){
        return "o monstro tem " + monstro.getVida();
    }
}
