/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import java.util.List;
import simulartprogect.generadoresaleatorios.GeneradorDePaquetes;
import simulartprogect.modelo.AdministradorDePaquete.TipoPaquete;
import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.Seccion;

/**
 *
 * @author Irene Argollo
 */
public class Recepcionista extends Funcionario {

    private GeneradorDePaquetes generadorAleatorio;
    private List<TipoPaquete> paquetesDisponibles;

    public Recepcionista(int code, Seccion seccion) {
        super(code, seccion);
        paquetesDisponibles = seccionSupervisora
                              .getAdministradorDePaquetes().getPaquetesDisponibles();
    }

    @Override
    public void atender(Cliente cliente) {
        cliente.consultarPaquetes(generadorAleatorio.generarPaquetes(paquetesDisponibles, cliente));
        System.out.println("informacion respecto a paquetes de tipo(s)...");
    }

}
