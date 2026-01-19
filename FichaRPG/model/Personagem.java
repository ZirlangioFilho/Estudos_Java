package FichaRPG.model;

import java.util.Scanner;

public class Personagem {
    private String nomeJogador, nomePersonagem, classe, raca;
    private int forca, inteligencia, destreza, carisma;

    public Personagem(String nomeJogador, String nomePersonagem, String classe, String raca){
        this.nomeJogador = nomeJogador;
        this.nomePersonagem = nomePersonagem;
        this.classe = classe;
        this.raca = raca;
    }

    
    public String getNomeJogador() {
        return nomeJogador;
    }



    public String getNomePersonagem() {
        return nomePersonagem;
    }



    public String getClasse() {
        return classe;
    }



    public String getRaca() {
        return raca;
    }

    public String getFicha() {
    return
        "===== FICHA DO PERSONAGEM =====\n" +
        "Jogador: " + nomeJogador + "\n" +
        "Personagem: " + nomePersonagem + "\n" +
        "Classe: " + classe + "\n" +
        "Raça: " + raca + "\n\n" +
        "--- ATRIBUTOS ---\n" +
        "Força: " + forca + "\n" +
        "Inteligência: " + inteligencia + "\n" +
        "Destreza: " + destreza + "\n" +
        "Carisma: " + carisma;
}


public int distribuirPontos() {
    Scanner sc = new Scanner(System.in);

    int totalDePontos = 10;
    int opcao;

    while (totalDePontos > 0) {
        System.out.println("\nPontos disponíveis: " + totalDePontos);
        System.out.println("Escolha um atributo para distribuir:");
        System.out.println("1 - Força");
        System.out.println("2 - Inteligência");
        System.out.println("3 - Destreza");
        System.out.println("4 - Carisma");
        System.out.print("Opção: ");

        opcao = sc.nextInt();

        System.out.print("Quantos pontos deseja adicionar? ");
        int valor = sc.nextInt();

        if (valor > totalDePontos) {
            System.out.println("Você não tem pontos suficientes!");
            continue;
        }

        switch (opcao) {
            case 1:
                forca += valor;
                break;
            case 2:
                inteligencia += valor;
                break;
            case 3:
                destreza += valor;
                break;
            case 4:
                carisma += valor;
                break;
            default:
                System.out.println("Opção inválida!");
                continue;
        }
        sc.close();
        totalDePontos -= valor;
    }

    System.out.println("\nTodos os pontos foram distribuídos!");
    return totalDePontos;
}

    public void mostrarFicha() {
    System.out.println("\n===== FICHA DO PERSONAGEM =====");
    System.out.println("Jogador: " + nomeJogador);
    System.out.println("Personagem: " + nomePersonagem);
    System.out.println("Classe: " + classe);
    System.out.println("Raça: " + raca);

    System.out.println("\n--- ATRIBUTOS ---");
    System.out.println("Força: " + forca);
    System.out.println("Inteligência: " + inteligencia);
    System.out.println("Destreza: " + destreza);
    System.out.println("Carisma: " + carisma);

    System.out.println("===============================");
}


    @Override
    public String toString() {
        return "Nome: " + nomeJogador + " Personagem: " + nomePersonagem + " Classe: " + classe + " Raça: " + raca;
    }
}
