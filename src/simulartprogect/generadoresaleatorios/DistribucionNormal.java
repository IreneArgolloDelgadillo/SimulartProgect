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
public class DistribucionNormal {
    public int obtenerNormal(double niu, double desviacion, int k)
    {
        int res;
        double r = 0.0;
        GeneradorCongruencialMixto c = new GeneradorCongruencialMixto();
        for (int i = 0 ; i <= k ; i++)
        {
            r = c.numeroAleatorio()+r ;
        }
        
        return res = (int)(niu + desviacion * ((r-(k/2))/ Math.sqrt(k/2)));
    }
}
