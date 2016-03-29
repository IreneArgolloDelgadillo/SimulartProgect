/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.simuladores;

import java.util.logging.Logger;
import simulartprogect.generadoresaleatorios.GeneradorDeClientes;
import simulartprogect.generadoresaleatorios.FrecuenciaDeLLegada;
import simulartprogect.modelo.Cliente.Tipo;

/**
 *
 * @author Irene Argollo
 */
public class SimuladorDeLlegada extends Thread {

    private final GeneradorDeClientes generadorDeClientes;
    private final FrecuenciaDeLLegada tiempo;
    private boolean estaHabilitado;

    public SimuladorDeLlegada() {
        this.generadorDeClientes = new GeneradorDeClientes();
        this.tiempo = new FrecuenciaDeLLegada();
    }

    public void desactivar() {
        estaHabilitado = false;
    }

    @Override
    public void run() {
        Tipo cliente;
        while (estaHabilitado) {
            cliente = generadorDeClientes.generarCliente();
            try {
                sleep(tiempo.obtenerTiempo(cliente));
            } catch (InterruptedException execepcion) {
                Logger.getLogger(GeneradorDeClientes.class.getName(),
                        execepcion.getMessage());
            }
        }
    }
}
