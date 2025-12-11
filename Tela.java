import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame {
    public Tela() {
        setTitle("Projeto Interativo - Tela Inicial");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Bem-vindo ao Projeto Interativo!");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));

        JButton botao = new JButton("Clique aqui");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão clicado!");
            }
        });

        add(titulo);
        add(botao);
    }
}
