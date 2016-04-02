/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.vistas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Irene Argollo
 */
public class AccionIniciar extends AbstractAction {

    private final PanelAgencia panel;

    public AccionIniciar(PanelAgencia panelAgencia) {
        panel = panelAgencia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog datos = new JDialog();
        datos.setLayout(new GridLayout(4, 2));

        JTextArea infoText = new JTextArea(1, 5);
        JTextArea contText = new JTextArea(1, 5);
        JTextArea cajaText = new JTextArea(1, 5);
        datos.add(new JLabel("Cantidad de recepcionistas"));
        datos.add(infoText);
        datos.add(new JLabel("Cantidad de contratistas"));
        datos.add(contText);
        datos.add(new JLabel("Cantidad de cajeros"));
        datos.add(cajaText);

        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener((ActionEvent e1) -> {
            try {
                int cantInfor = Integer.valueOf(infoText.getText());
                int cantContrat = Integer.valueOf(infoText.getText());
                int cantCajero = Integer.valueOf(infoText.getText());
                panel.setAgencia(cantInfor, cantContrat, cantCajero);
                datos.setVisible(false);
                panel.repaint();
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(datos, "Solo introdusca numeros",
                        "introdusca la cantidad de funcionarios por Seccion",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        datos.add(aceptar);
        datos.setLocationRelativeTo(null);
        datos.setSize(400, 100);
        datos.setResizable(false);
        datos.setVisible(true);
    }

}
