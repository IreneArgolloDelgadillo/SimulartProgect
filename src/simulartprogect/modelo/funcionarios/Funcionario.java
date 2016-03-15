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
public interface Funcionario {
    public boolean estaDisponible();
    public void atender(Cliente cliente);
}
