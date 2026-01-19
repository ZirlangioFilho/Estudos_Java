package Media;

import java.util.Scanner;

public class DemoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int matricula = sc.nextInt();
        System.out.println("Digite nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite nota 3:");
        double nota3 = sc.nextDouble();

        sc.close();

        Aluno jaer = new Aluno(nome, matricula, nota1, nota2, nota3);
        jaer.exibirMedia();
    }
}
