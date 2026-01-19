package LutaComArmas;

public class DemoLutaComArma {
    public static void main(String[] args) {
        Guerreiro zeta = new Guerreiro("Zeta", Armas.Espada);
        System.out.println(zeta.getNome());
        System.out.println(zeta.getArma());

        System.out.println(Armas.Faca.getDano());
        System.out.println(Armas.Espada.getDano());
        System.out.println(Armas.Katana.getDano());
        System.out.println(Armas.Escalibur.getDano());
    }
}
