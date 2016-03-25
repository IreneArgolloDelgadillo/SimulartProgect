/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneradorCongruencialMixto {

    private final int a;
    private final int xo;
    private final int c;
    private final int m;

    public GeneradorCongruencialMixto() {
        a = 34;
        xo = 3;
        c = 2;
        m = 99;
    }

    public GeneradorCongruencialMixto(int a, int xo, int c, int m) {
        this.a = a;
        this.xo = xo;
        this.c = c;
        this.m = m;
    }

    public Double numeroAleatorio() {
        List<Double> lista = generarSecuencia();
        return lista.get((int) (Math.random() * lista.size() - 1));
    }

    private List<Double> generarSecuencia() {
        List<Integer> secuencia = new ArrayList<>();
        List<Double> secuenciaD = new ArrayList<>();
        int x = xo;
        do {
            x = ((a * x) + c) % m;
            secuencia.add(x);
            secuenciaD.add(((double) x) / m);
        } while (esDeCicloCompleto(secuencia) == true);

        return secuenciaD;
    }

    private boolean esDeCicloCompleto(List<Integer> secu) {
        boolean res = true;
        int i = 0;
        int j = 1;
        while ((res == true) && (i < secu.size())) {
            for (; j < secu.size(); j++) {
                if (Objects.equals(secu.get(i), secu.get(j))) {
                    res = false;
                }
            }
            i++;
        }
        return res;

    }

}