/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.vistas;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import simulartprogect.modelo.AgenciaDeTurismo;
import simulartprogect.modelo.secciones.Seccion;

/**
 *
 * @author Irene Argollo
 */
public class PanelAgencia extends JPanel {

    private AgenciaDeTurismo agencia ;
    private  Seccion recepciones, contratos, caja;

    public PanelAgencia() {
        setAgencia(1, 2, 2);
        iniciarUI();
    }
    
    public void setAgencia(int inf, int contratistas, int cajeros){//AgenciaDeTurismo agencia) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        this.agencia = new AgenciaDeTurismo(inf, contratistas, cajeros);
        
        recepciones = agencia.getSeccionInfomaciones();
        contratos = agencia.getSeccionContratos();
        caja = agencia.getSeccionCaja();
        iniciarUI();
    }

    private void iniciarUI() {
        VistaDeSeccion vistaRecepciones = new VistaDeSeccion(recepciones);
        VistaDeSeccion vistaContratos = new VistaDeSeccion(contratos);
        VistaDeSeccion vistaCaja = new VistaDeSeccion(caja);

        add(vistaRecepciones);
        add(vistaContratos);
        add(vistaCaja);
    }
}
