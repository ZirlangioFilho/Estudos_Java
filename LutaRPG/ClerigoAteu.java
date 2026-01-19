package LutaRPG;

public class ClerigoAteu extends Luta implements LutaClerigo{
    @Override
    public String quantidadeFe() {
        return "Nenhuma, nunca pedi bença vó";
        
    }

    @Override
    public String estiloLuta(){
        return "Luta preces";
    }


}
