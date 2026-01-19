package FichaRPG.gui;

import FichaRPG.model.Personagem;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaFichaRPG extends JPanel {

    public TelaFichaRPG(JPanel container, CardLayout layout) {
        setLayout(null);
        setBackground(new Color(200, 200, 200));

        JLabel titulo = new JLabel("Criar Ficha RPG");
        titulo.setBounds(160, 10, 200, 30);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(titulo);

        int xLabel = 20;
        int xField = 170;
        int larguraField = 200;
        int altura = 25;

        int y = 60; // posição inicial

        // Jogador
        JLabel jogadorLabel = new JLabel("Nome do Jogador:");
        jogadorLabel.setBounds(xLabel, y, 150, altura);
        add(jogadorLabel);

        JTextField nomeJogadorField = new JTextField();
        nomeJogadorField.setBounds(xField, y, larguraField, altura);
        add(nomeJogadorField);

        // Personagem
        y += 40;
        JLabel personagemLabel = new JLabel("Nome do Personagem:");
        personagemLabel.setBounds(xLabel, y, 150, altura);
        add(personagemLabel);

        JTextField nomePersonagemField = new JTextField();
        nomePersonagemField.setBounds(xField, y, larguraField, altura);
        add(nomePersonagemField);

        // Classe
        y += 40;
        JLabel classeLabel = new JLabel("Classe:");
        classeLabel.setBounds(xLabel, y, 150, altura);
        add(classeLabel);

        JTextField classeField = new JTextField();
        classeField.setBounds(xField, y, larguraField, altura);
        add(classeField);

        // Raça
        y += 40;
        JLabel racaLabel = new JLabel("Raça:");
        racaLabel.setBounds(xLabel, y, 150, altura);
        add(racaLabel);

        JTextField racaField = new JTextField();
        racaField.setBounds(xField, y, larguraField, altura);
        add(racaField);

        // Botão
        y += 50;
        JButton criar = new JButton("Criar Ficha");
        criar.setBounds(170, y, 150, 30);
        add(criar);

        // Resultado
        y += 50;
        JTextArea resultado = new JTextArea();
        resultado.setBounds(20, y, 400, 100);
        resultado.setEditable(false);
        add(resultado);

        criar.addActionListener(e -> {
            Personagem p = new Personagem(
                nomeJogadorField.getText(),
                nomePersonagemField.getText(),
                classeField.getText(),
                racaField.getText()
            );
            resultado.setText(p.toString());
        });
    }
}
