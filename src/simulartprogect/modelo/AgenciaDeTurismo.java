/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import simulartprogect.modelo.secciones.Seccion;
import simulartprogect.modelo.secciones.CajaDePagos;
import simulartprogect.modelo.secciones.Contratos;
import simulartprogect.modelo.secciones.Informaciones;
import simulartprogect.modelo.simuladores.SimuladorDeLlegada;

/**
 *
 * @author Irene Argollo
 */
public class AgenciaDeTurismo {

    public static final String NOMBRE = "Caxia Tours";
    private final AdministradorDePaquete administradorDePaquetes;
    private final Seccion seccionInfomaciones;
    private final Seccion seccionContratos;
    private final Seccion seccionCaja;
    private SimuladorDeLlegada simulador;

    public AgenciaDeTurismo(int informaciones, int contratistas, int cajas) {
        
        administradorDePaquetes = new AdministradorDePaquete();
        
        seccionInfomaciones = new Informaciones(administradorDePaquetes);
        seccionInfomaciones.contratar(informaciones);
        
        seccionContratos = new Contratos(administradorDePaquetes);
        seccionContratos.contratar(contratistas);
        
        seccionCaja = new CajaDePagos(administradorDePaquetes);
        seccionCaja.contratar(cajas);
    }

    public AdministradorDePaquete getAdministradorDePaquetes() {
        return administradorDePaquetes;
    }

    public Seccion getSeccionInfomaciones() {
        return seccionInfomaciones;
    }

    public Seccion getSeccionContratos() {
        return seccionContratos;
    }

    public Seccion getSeccionCaja() {
        return seccionCaja;
    }

}
