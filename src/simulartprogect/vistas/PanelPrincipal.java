/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.vistas;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Irene Argollo
 */
public class PanelPrincipal extends JPanel{
    
    public PanelPrincipal() {
        super(new BorderLayout());
        iniciar();
    }
    private void iniciar() {
        JPanel butonsPanel = new JPanel();
        butonsPanel.setLayout(new BoxLayout(butonsPanel, BoxLayout.Y_AXIS));

        PanelAgencia panelAgencia = new PanelAgencia();
        panelAgencia.setBackground(Color.lightGray);
        JButton iniciar = new JButton("Iniciar");
        iniciar.addActionListener(new AccionIniciar(panelAgencia));
        butonsPanel.add(iniciar);
        
        add(butonsPanel, BorderLayout.WEST);
        add(panelAgencia, BorderLayout.CENTER);
        add(new JLabel(new ImageIcon("puerta.PNG")), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JPanel content = new PanelPrincipal();
            SwingUtilities.invokeLater(() -> {
            ventana.add(content);
            ventana.setSize(600, 600);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(content);
        });
    }
}
