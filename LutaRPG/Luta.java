package LutaRPG;
abstract class Luta {
    abstract String estiloLuta();

    public String exibirLuta(){
        return (estiloLuta());
    }
}
