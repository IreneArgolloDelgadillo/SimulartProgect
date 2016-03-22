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
public class Recepcionista extends Funcionario{

    public Recepcionista(int code) {
        super(code);
    }
    
    @Override
    public void atender(Cliente cliente) {
        System.out.println("informacion respecto a paquetes de tipo(s)...");
    }
    
}
