package simulartprogect.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelCola extends JPanel {

    private Cliente cliente = new Cliente(0, 0);
    private List<Cliente> clientes;
    private Timer timer;

    public PanelCola(Dimension d) {
        clientes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            clientes.add(cliente);
        }
        setSize(d);
        setPreferredSize(d);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(new Color(0, 255, 0));
        cliente.LimitesXY(getWidth(), getHeight());
        timer = new Timer(16, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cliente.move();
                repaint();
            }
        });
    }

    public void animar() {//boolean turnOnOff) {
        boolean turnOnOff = true;
        if (turnOnOff) {
            cliente.setVelocidadXY();
            timer.start();
        } else {
            timer.stop();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < clientes.size(); i++) {
        animar();
        super.paintComponent(g);
            clientes.get(i).dibujar(g);
        }
    }

}
