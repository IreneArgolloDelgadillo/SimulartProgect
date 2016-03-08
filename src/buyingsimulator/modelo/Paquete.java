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
public class Paquete {

    public enum Tipo {
        LOCAL(100),
        DEPORTIVOS(100),
        EXCURCIONES(100);
        private int cantidadDisponible;

        private Tipo(int stok) {
            cantidadDisponible = stok;
        }

        public void ocupar(int paquetes) {
            cantidadDisponible = -paquetes;
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }
    };

    private Tipo tipoPaquete;

    @Override
    public String toString() {
        return String.format("El paquete escogido es del tipo %s y la cantidad "
                + "actual disponible de dicho paquete es %d", tipoPaquete, tipoPaquete.cantidadDisponible);
    }
}
