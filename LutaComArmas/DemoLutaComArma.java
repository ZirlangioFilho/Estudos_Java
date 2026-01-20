package LutaComArmas;

public class DemoLutaComArma {
    public static void main(String[] args) {
        System.out.println("=======================================");
        Guerreiro zeta = new Guerreiro("Zeta", Armas.Escalibur);
        System.out.println("Nome Guerreiro: " + zeta.getNome());
        System.out.println(zeta.getArma());

        System.out.println("O guerreiro tem força " + zeta.golpe());
        System.out.println("=======================================");
        System.out.println("A arma " + Armas.Faca.name() + " tem " +Armas.Faca.getDano() + " de dano");
        System.out.println("A arma " + Armas.Espada.name()+ " tem " +Armas.Espada.getDano() + " de dano");
        System.out.println("A arma " + Armas.Katana.name()+ " tem " +Armas.Katana.getDano() + " de dano");
        System.out.println("A arma " + Armas.Machado.name()+ " tem " +Armas.Machado.getDano() + " de dano");
        System.out.println("A arma " + Armas.Escalibur.name() + " tem " +Armas.Escalibur.getDano() + " de dano");
        System.out.println("=======================================");

        Monstro regenerator = new Monstro("Regenerator", 100);
        System.out.println("O monstro " + regenerator.getNome() + " tem vida de " + regenerator.getVida());
        System.out.println(regenerator.danoRecebido(zeta.golpe()));
        System.out.println("=======================================");

        Combate combate = new Combate(zeta, regenerator);
        System.out.println(combate.mostroVida());
        System.out.println(combate.luta(zeta.golpe()));
    }
}
