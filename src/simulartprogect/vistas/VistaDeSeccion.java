/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import simulartprogect.modelo.AdministradorDePaquete;
import simulartprogect.modelo.secciones.CajaDePagos;
import simulartprogect.modelo.secciones.Seccion;

/**
 *
 * @author Irene Argollo
 */
public class VistaDeSeccion extends JPanel {

    private final Seccion seccion;
    private JPanel panelFunc;
    private JPanel cola;

    public VistaDeSeccion(Seccion seccion) {
        setLayout(new BorderLayout());
        this.seccion = seccion;
        iniciarUI();
    }

    private void iniciarUI() {
        panelFunc = new JPanel();
        panelFunc.setLayout(new BoxLayout(panelFunc, BoxLayout.PAGE_AXIS));
        for (int i = 0; i < seccion.getCantidadFuncionarios(); i++) {
            panelFunc.add(new JLabel(seccion.getIcon()));
        }

        cola = new PanelCola(new Dimension(1000, 1000));
        add(panelFunc, BorderLayout.EAST);
        add(cola);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        Seccion seccion = new CajaDePagos(new AdministradorDePaquete());
        seccion.contratar(2);
//        VistaDeSeccion vista = new VistaDeSeccion(seccion);
        SwingUtilities.invokeLater(() -> {
            ventana.setSize(500, 500);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            PanelCola vista = new PanelCola(new Dimension(1000, 1000));
            ventana.add(vista);
            ventana.setVisible(true);
        });
    }
}
