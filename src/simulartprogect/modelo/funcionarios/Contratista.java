/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.modelo.Cliente;

/**
 *
 * @author Irene Argollo
 */
public class Contratista extends Funcionario {

    public Contratista(int code) {
        super(code);
    }

    @Override
    public void atender(Cliente cliente) {
        super.cambiarDisponibilidad();
        cliente.consultarPaquetes();
        System.err.println(String.format("Se esta atendiendo al cliente %d", cliente.getCi()));
        super.cambiarDisponibilidad();
    }

}
