package FichaRPG.gui;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import FichaRPG.model.Personagem;

public class TelaMenu extends JPanel {

    public TelaMenu(JPanel container, CardLayout layout, ArrayList<Personagem> jogadores) {

        setLayout(null);

        JLabel titulo = new JLabel("Menu Principal");
        titulo.setBounds(180, 20, 200, 30);
        add(titulo);

        JButton criar = new JButton("Criar Ficha");
        criar.setBounds(150, 80, 200, 40);
        add(criar);

        JButton ver = new JButton("Ver Jogadores");
        ver.setBounds(150, 140, 200, 40);
        add(ver);

        criar.addActionListener(e -> layout.show(container, "ficha"));

        ver.addActionListener(e -> layout.show(container, "lista"));
    }
}
