/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.Seccion;

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
        if (disponible) {
            cliente.cancelar();
        }
    }

}
