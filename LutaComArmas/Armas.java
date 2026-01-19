package LutaComArmas;

public enum Armas {
    Faca(10),
    Espada(20),
    Katana(30),
    Machado(50),
    Escalibur(100);

    private final int dano;

    Armas(int dano){
        this.dano = dano;
    }

    public String getNome(){
        return name();
    }

    public int getDano(){
       return dano;
    }


}