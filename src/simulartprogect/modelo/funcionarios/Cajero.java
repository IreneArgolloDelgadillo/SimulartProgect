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
public class Cajero implements Funcionario{

    private final int cod;
    private boolean disponible;

    public Cajero(int codigo) {
        cod = codigo;
    }
    
    @Override
    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    public void atender(Cliente cliente) {
        if(!disponible) {
            cliente.cancelar();
        }
    }
    
}