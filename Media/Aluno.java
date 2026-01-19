package Media;

public class Aluno {
    private String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public String getBolinhaDeTenis() {
        return nome;
    }


    public double media(){
       return (nota1 + nota2 + nota3)/3;
    }

    public void exibirMedia(){
        System.out.println(media());
    }


    @Override
    public String toString() {
        return "nome: " + nome + " matricula: " + matricula + " nota1: " + nota1 + " nota2: " + nota2 + " nota3: " + nota3;
    }

}
