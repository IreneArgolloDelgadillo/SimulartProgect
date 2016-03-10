/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.awt.geom.Point2D;


/**
 *
 * @author Irene Argollo
 */
public class Cliente {

    public enum Tipo {
        ESTUDIANTE(new Rango(0d, 0.15)),
        DEPORTISTA(new Rango(0.15, 0.35)),
        TURISTA_NACIONAL(new Rango(0.35, 0.60)),
        TURISTA_EXTRANGERO(new Rango(0.6, 0.35));
        
        private Rango r_normal;
        
        private Tipo(Rango p) {
            r_normal = p;
        }
        
        public Rango getR_Normal() {
            return r_normal;
        }
    }
    private final Tipo tipoCliente;
    private final int ci;

    public Cliente(Tipo tipo, int ci) {
        tipoCliente = tipo;
        this.ci = ci;
    }

    public Tipo getTipo() {
        return tipoCliente;
    }

    public void consultarPaquetes() {
    }

    public void hacerContrato() {
    }

    public void cancelar() {
    }
}
