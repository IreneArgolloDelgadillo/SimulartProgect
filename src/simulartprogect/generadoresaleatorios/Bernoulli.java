/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

/**
 *
 * @author Andrea
 */
public class Bernoulli {
    public boolean aceptacion(double p)
    {boolean res = false;
        GeneradorCongruencialMixto c = new GeneradorCongruencialMixto();
        if (c.numeroAleatorio() > p )
        { res = true ;}
     return res;
    }
}
