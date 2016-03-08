/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyingsimulator.modelo;

/**
 *
 * @author Irene Argollo
 */
public class Cliente {

    public enum Tipo {
        ESTUDIANTE,
        DEPORTISTA,
        TURISTA_NACIONAL,
        TURISTA_EXTRANGERO
    }
    private Tipo tipoCliente;
    private int ci;

    public Cliente(Tipo tipo, int ci) {
        tipoCliente = tipo;
        this.ci = ci;
    }

    public void consultarPaquetes() {
    }

    public void hacerContrato() {
    }

    public void cancelar() {
    }
}
