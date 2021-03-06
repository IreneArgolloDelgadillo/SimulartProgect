/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.secciones;

import javax.swing.ImageIcon;
import simulartprogect.modelo.AdministradorDePaquete;
import simulartprogect.modelo.funcionarios.Cajero;

/**
 *
 * @author Irene Argollo
 */
public class CajaDePagos extends Seccion{

    public CajaDePagos(AdministradorDePaquete administradorP) {
        super(administradorP);
        icon = new ImageIcon("cajero.PNG");
    }

    @Override
    public void contratar(int cantidad) {
        for(int i = 0; i < cantidad; i++) {
            funcionarios.add(new Cajero(i, this));
        }
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }
    
}
