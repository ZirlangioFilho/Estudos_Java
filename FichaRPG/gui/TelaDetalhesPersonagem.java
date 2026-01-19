package FichaRPG.gui;

import javax.swing.*;
import java.awt.*;
import FichaRPG.model.Personagem;

public class TelaDetalhesPersonagem extends JPanel {

    private Personagem personagem;

    public TelaDetalhesPersonagem(JPanel container, CardLayout layout, Personagem personagem) {

        this.personagem = personagem;

        setLayout(null);

        JLabel titulo = new JLabel("Detalhes do Personagem");
        titulo.setBounds(120, 10, 300, 30);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo);

        int y = 60;

        JLabel jogadorLabel = new JLabel("Jogador: " + personagem.getNomeJogador());
        jogadorLabel.setBounds(40, y, 400, 25);
        add(jogadorLabel);

        y += 30;
        JLabel personagemLabel = new JLabel("Personagem: " + personagem.getNomePersonagem());
        personagemLabel.setBounds(40, y, 400, 25);
        add(personagemLabel);

        y += 30;
        JLabel classeLabel = new JLabel("Classe: " + personagem.getClasse());
        classeLabel.setBounds(40, y, 400, 25);
        add(classeLabel);

        y += 30;
        JLabel racaLabel = new JLabel("Raça: " + personagem.getRaca());
        racaLabel.setBounds(40, y, 400, 25);
        add(racaLabel);

        // Se depois você adicionar atributos, ficam aqui
        // exemplo: Força, Destreza etc.

        JButton voltar = new JButton("Voltar");
        voltar.setBounds(160, 300, 140, 30);
        add(voltar);

        voltar.addActionListener(e -> {
            layout.show(container, "listaJogadores");
        });
    }
}
