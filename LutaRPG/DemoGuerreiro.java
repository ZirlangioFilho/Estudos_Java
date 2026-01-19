package LutaRPG;
public class DemoGuerreiro {
    public static void main(String[] args) {
        Samurai samurai = new Samurai();
        System.out.println(samurai.exibirLuta());

        Ladino ladino = new Ladino();
        System.out.println(ladino.exibirLuta());

        ClerigoAteu clerigo = new ClerigoAteu();
        System.out.println(clerigo.exibirLuta());
        System.out.println(clerigo.ManaCura);
    
    }
}
