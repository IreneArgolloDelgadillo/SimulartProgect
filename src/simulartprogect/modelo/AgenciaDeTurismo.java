/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.HashMap;
import simulartprogect.modelo.AdministradorDePaquete.Tipo;

/**
 *
 * @author Irene Argollo
 */
public class AgenciaDeTurismo {

    public static final String nombre = "Caxia Tours";
    private AdministradorDePaquete administradorDePaquetes;

    public AgenciaDeTurismo() {
        administradorDePaquetes = new AdministradorDePaquete();
    }

    public int disponibles(Tipo tipo) {
        return administradorDePaquetes.cantidadDisponible(tipo);
    }

    public void descontar(HashMap<Tipo, Integer> pedidos) {
        administradorDePaquetes.comprarPaquete(pedidos);
    }

}
