/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Irene Argollo
 */
public class AdministradorDePaquete {

    private final List<TipoPaquete> tiposDePaquetes;

    public AdministradorDePaquete() {
        tiposDePaquetes = new ArrayList<>();
        tiposDePaquetes.add(TipoPaquete.LOCAL);
        tiposDePaquetes.add(TipoPaquete.DEPORTIVOS);
        tiposDePaquetes.add(TipoPaquete.EXCURCIONES);
    }

    public int cantidadDisponible(TipoPaquete tipo) {
        int disponible = 0;

        for (TipoPaquete t : tiposDePaquetes) {
            if (t.equals(tipo)) {
                return t.getCantidadDisponible();
            }
        }
        return disponible;
    }

    public boolean verificarDisponibilidadDePaquete(TipoPaquete tipo, int cantidad) {
        for (TipoPaquete tipoPaquete : tiposDePaquetes) {
            if (tipoPaquete.equals(tipo)) {
                return tipoPaquete.verificarDisponibilidad(cantidad);
            }
        }
        return false;
    }

    public void comprarPaquete(Map<TipoPaquete, Integer> pedidos) {
        tiposDePaquetes.stream().forEach((tipo) -> {
            if (pedidos.containsKey(tipo)) {
                tipo.reportarVenta(pedidos.get(tipo));
            }
        });
    }

    public List<TipoPaquete> getPaquetesDisponibles() {
        return tiposDePaquetes;
    }

    public enum TipoPaquete {
        LOCAL(100, 350),
        DEPORTIVOS(100, 300),
        EXCURCIONES(100, 50);

        public final int cantidadInicial;
        public final long presio;
        private int cantidadDisponible;

        private TipoPaquete(int stok, long presio) {
            cantidadInicial = stok;
            this.presio = presio;
            cantidadDisponible = stok;
        }

        public boolean verificarDisponibilidad(int cantidad) {
            return cantidadDisponible >= cantidad;
        }

        public void reportarVenta(int cantidadVendidos) {
            if (cantidadDisponible >= cantidadVendidos) {
                cantidadDisponible = -cantidadVendidos;
            }
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }
    };

}
