package FichaRPG.gui;

import javax.swing.*;
import java.awt.CardLayout;
import java.util.ArrayList;

import FichaRPG.model.Personagem;

public class TelaPrincipal extends JFrame {

    public CardLayout layout;     // deixei public para outras telas poderem usar
    public JPanel container;      // idem

    // Lista global de personagens
    public ArrayList<Personagem> jogadores = new ArrayList<>();

    public TelaPrincipal() {

        setTitle("Ficha RPG");
        setSize(500, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // CardLayout e container COMPARTILHADOS
        layout = new CardLayout();
        container = new JPanel(layout);

        // cria telas usando o MESMO container e layout
        TelaMenu menu = new TelaMenu(container, layout, jogadores);
        TelaFichaRPG ficha = new TelaFichaRPG(container, layout);
        TelaListaDeJogadores lista = new TelaListaDeJogadores(container, layout, jogadores);
        TelaDetalhesPersonagem detalhes = new TelaDetalhesPersonagem(container, layout, jogadores);
        TelaAtributos atributos = new TelaAtributos(container, layout, jogadores);

        // registra cada tela com um nome
        container.add(menu, "menu");
        container.add(ficha, "ficha");
        container.add(lista, "lista");
        container.add(detalhes, "detalhes");
        container.add(atributos, "atributos");

        add(container);

        // primeira tela exibida
        layout.show(container, "menu");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}
