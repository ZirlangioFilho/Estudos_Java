package FichaRPG.gui;

import FichaRPG.model.Personagem;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TelaListaDeJogadores extends JPanel {

    public TelaListaDeJogadores(JPanel container, CardLayout layout, ArrayList<Personagem> jogadores) {

        setLayout(new BorderLayout());

        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Personagem p : jogadores) {
            modelo.addElement(p.getNomeJogador() + " - " + p.getNomePersonagem());
        }

        JList<String> lista = new JList<>(modelo);

        add(new JScrollPane(lista), BorderLayout.CENTER);
    }
}
