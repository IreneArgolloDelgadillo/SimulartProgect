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
public class Rango {

    private double lim_inf;
    private double lim_sup;

    public Rango(double inferior, double superior) {
        lim_inf = (inferior < superior) ? inferior : superior;
    }

    public double getLim_inf() {
        return lim_inf;
    }

    public double getLim_sup() {
        return lim_sup;
    }

    public boolean contiene(double punto) {
        return punto < lim_sup && punto > lim_inf;
    }
}
