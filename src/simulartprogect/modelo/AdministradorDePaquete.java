/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Irene Argollo
 */
public class AdministradorDePaquete {

    private final List<Tipo> tiposDePaquetes;

    public AdministradorDePaquete() {
        tiposDePaquetes = new ArrayList<>();
        tiposDePaquetes.add(Tipo.LOCAL);
        tiposDePaquetes.add(Tipo.DEPORTIVOS);
        tiposDePaquetes.add(Tipo.EXCURCIONES);
    }

    public int cantidadDisponible(Tipo tipo) {
        int disponible = 0;

        for (Tipo t : tiposDePaquetes) {
            if (t.equals(tipo)) {
                return t.getCantidadDisponible();
            }
        }
        return disponible;
    }

    public boolean verificarDisponibilidadDePaquete(Tipo tipo, int cantidad) {
        for (Tipo tipoPaquete : tiposDePaquetes) {
            if (tipoPaquete.equals(tipo)) {
                return tipoPaquete.verificarDisponibilidad(cantidad);
            }
        }
        return false;
    }

    public void comprarPaquete(HashMap<Tipo, Integer> pedidos) {
        tiposDePaquetes.stream().forEach((tipo) -> {
            if (pedidos.containsKey(tipo)) {
                tipo.reportarVenta(pedidos.get(tipo));
            }
        });
    }

    public enum Tipo {
        LOCAL(100, 350),
        DEPORTIVOS(100, 300),
        EXCURCIONES(100, 50);

        public final int cantidadInicial;
        public final long presio;
        private int cantidadDisponible;

        private Tipo(int stok, long presio) {
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
