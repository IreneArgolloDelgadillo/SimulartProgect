/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import simulartprogect.modelo.AdministradorDePaquete.TipoPaquete;

/**
 *
 * @author Irene Argollo
 */
public class Cliente {

    private final int ci;
    private final Tipo tipoCliente;
    private Map<TipoPaquete, Integer> paquetes;

    public Cliente(Tipo tipo, int ci) {
        tipoCliente = tipo;
        this.ci = ci;
    }

    public Tipo getTipo() {
        return tipoCliente;
    }

    public int getCi() {
        return ci;
    }

    public void consultarPaquetes(Map<TipoPaquete, Integer> paquetesDeInteres) {
        this.paquetes = paquetesDeInteres;
    }

    public void hacerContrato(Map<TipoPaquete, Integer> paquetesAComprar) {
        Random random = new Random();
        paquetes = tomarDecision(paquetesAComprar) ? paquetesAComprar : new HashMap<>();
        System.out.println("Se esta acordando comprar los paquetes:");
    }

    public void cancelar() {
    }

    public Map<TipoPaquete, Integer> getPaquetes() {
        return paquetes;
    }

    private boolean tomarDecision(Map<TipoPaquete, Integer> paquetesAComprar) {
        return paquetesAComprar.size() > 0;
    }

    public enum Tipo {
        ESTUDIANTE(new Rango(0d, 0.15), new Rango(0, 0.2), new Rango(0, 0.15), new Rango(0, 0.3)),
        DEPORTISTA(new Rango(0.15, 0.35), new Rango(0.2, 0.25), new Rango(0.15, 0.4), new Rango(0.3, 0.4)),
        TURISTA_NACIONAL(new Rango(0.35, 0.60), new Rango(0.25, 0.6), new Rango(0.4, 0.5), new Rango(0.4, 0.65)),
        TURISTA_EXTRANGERO(new Rango(0.6, 1), new Rango(0.6, 1), new Rango(0.5, 1), new Rango(0.65, 1));

        private final Rango rangoProbLlegada;
        private final Rango r_probTipoLoc;
        private final Rango r_probTipoDep;
        private final Rango r_probTipoExc;

        private Tipo(Rango p, Rango pTipoLoc, Rango pTipoDep, Rango pTipoExc) {
            rangoProbLlegada = p;
            r_probTipoLoc = pTipoLoc;
            r_probTipoDep = pTipoDep;
            r_probTipoExc = pTipoExc;
        }

        public Rango getRangoProbabilidadDeLlegada() {
            return rangoProbLlegada;
        }

        public Rango getR_probTipoDep() {
            return r_probTipoDep;
        }

        public Rango getR_probTipoExc() {
            return r_probTipoExc;
        }

        public Rango getRangoProbLlegada() {
            return rangoProbLlegada;
        }

        public Rango getR_probTipoLoc() {
            return r_probTipoLoc;
        }

    }

}
