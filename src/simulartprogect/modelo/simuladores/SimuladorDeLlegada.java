/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.simuladores;

import java.util.logging.Logger;
import simulartprogect.generadoresaleatorios.GeneradorDeClientes;
import simulartprogect.generadoresaleatorios.FrecuenciaDeLLegada;

/**
 *
 * @author Irene Argollo
 */
public class SimuladorDeLlegada extends Thread {

    private GeneradorDeClientes generadorDeClientes;
    private boolean estaHabilitado;

    public void desactivar() {
        estaHabilitado = false;
    }

    @Override
    public void run() {
        FrecuenciaDeLLegada tiempo = new FrecuenciaDeLLegada();
        while (estaHabilitado) {
            generadorDeClientes.generarCliente();
            try {
                sleep(tiempo.siguienteTiempoDellegada());
            } catch (InterruptedException execepcion) {
                Logger.getLogger(GeneradorDeClientes.class.getName(),
                                    execepcion.getMessage());
            }
        }
    }
}
