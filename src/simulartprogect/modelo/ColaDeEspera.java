/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Irene Argollo
 */
public class ColaDeEspera implements OyenteDeLlegadaDeCliente{ 

    private Queue<Cliente> clientes;

    public ColaDeEspera() {
        clientes = new LinkedList<>();
    }
    public Cliente siguienteCliente() {
        return clientes.remove();
    }

    @Override
    public void notificarLlegada(Cliente cliente) {
        clientes.add(cliente);
    }
}
