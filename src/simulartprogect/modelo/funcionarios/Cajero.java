/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.secciones.Seccion;

/**
 *
 * @author Irene Argollo
 */
public class Cajero extends Funcionario {

    public Cajero(int codigo, Seccion seccion) {
        super(codigo, seccion);
    }

    @Override
    public void atender(Cliente cliente) {
        cliente.cancelar();
        seccionSupervisora.getAdministradorDePaquetes().comprarPaquete(cliente.getPaquetes());
    }

}
