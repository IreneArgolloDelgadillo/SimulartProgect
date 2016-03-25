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
public class DistribucionUniforme {
    public int obtenerTiempoUniforme(int a, int b)
    {
      double r;
      int res;
      GeneradorCongruencialMixto c = new GeneradorCongruencialMixto();
      r=c.numeroAleatorio();
      res = (int)(a + (b - a)*r) ;
      return res;
    }
}
