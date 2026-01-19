package FichaRPG.gui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TelaAtributos extends JPanel {

    private int pontos = 20; // pontos iniciais

    public TelaAtributos(JPanel container, CardLayout layout) {

        setLayout(null);

        JLabel titulo = new JLabel("Distribuição de Atributos");
        titulo.setBounds(130, 10, 300, 30);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo);

        JLabel pontosRestantes = new JLabel("Pontos restantes: " + pontos);
        pontosRestantes.setBounds(160, 40, 200, 25);
        add(pontosRestantes);

        // mapa para guardar campos
        Map<String, JSpinner> atributos = new HashMap<>();

        String[] nomes = {
            "Força", "Destreza", "Constituição",
            "Inteligência", "Sabedoria", "Carisma"
        };

        int y = 80;

        for (String n : nomes) {

            JLabel label = new JLabel(n + ":");
            label.setBounds(60, y, 120, 25);
            add(label);

            JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
            spinner.setBounds(200, y, 60, 25);

            atributos.put(n, spinner);
            add(spinner);

            y += 35;
        }

        JButton confirmar = new JButton("Confirmar");
        confirmar.setBounds(80, 310, 120, 30);
        add(confirmar);

        JButton voltar = new JButton("Voltar ao Menu");
        voltar.setBounds(240, 310, 150, 30);
        add(voltar);

        // atualizar pontos restantes quando mudar valores
        atributos.values().forEach(spinner -> ((JSpinner) spinner).addChangeListener(e -> {

            int soma = atributos.values()
                    .stream()
                    .mapToInt(s -> (int) ((JSpinner) s).getValue())
                    .sum();

            pontosRestantes.setText("Pontos restantes: " + (20 - soma));
        }));

        voltar.addActionListener(e -> {
            layout.show(container, "menu");
        });

        confirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                this,
                "Atributos salvos com sucesso!"
            );

            layout.show(container, "menu");
        });
    }
}
