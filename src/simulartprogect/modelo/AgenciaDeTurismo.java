/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.HashMap;
import java.util.List;
import simulartprogect.modelo.AdministradorDePaquete.TipoPaquete;
import simulartprogect.modelo.simuladores.SimuladorDeLlegada;

/**
 *
 * @author Irene Argollo
 */
public class AgenciaDeTurismo {

    public static final String NOMBRE = "Caxia Tours";
    private AdministradorDePaquete administradorDePaquetes;
    private List<Seccion> seccionesDeAtencion;
    private SimuladorDeLlegada simulador;

    public AgenciaDeTurismo() {
        administradorDePaquetes = new AdministradorDePaquete();
    }

    public int disponibles(TipoPaquete tipo) {
        return administradorDePaquetes.cantidadDisponible(tipo);
    }

    public void descontar(HashMap<TipoPaquete, Integer> pedidos) {
        administradorDePaquetes.comprarPaquete(pedidos);
    }

}
