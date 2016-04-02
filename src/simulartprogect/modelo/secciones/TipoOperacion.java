/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.secciones;

/**
 *
 * @author Irene Argollo
 */
public enum TipoOperacion {
    INFORMACIONES(0, 10000, "Brindar Informacion"),
    CONTRATOS(0, 10000, "Gestion de Contratos"),
    CAJA_DE_PAGOS(0, 10000, "Generacion De Facturas");

    private final int milisegundos_min;
    private final int milisegundos_max;
    private final String descripcion;

    private TipoOperacion(int tiempo_min, int tiempo_max, String descripcion) {
        milisegundos_min = (tiempo_min < tiempo_max) ? tiempo_min : tiempo_max;
        milisegundos_max = (tiempo_min < tiempo_max) ? tiempo_max : tiempo_min;
        this.descripcion = descripcion;
    }

    public int getMilisengundos_min() {
        return milisegundos_min;
    }

    public int getMilisegundos_max() {
        return milisegundos_max;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
