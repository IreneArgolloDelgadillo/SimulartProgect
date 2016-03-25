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
public class DistribucionExponencial {
  public int obtenerDE(int media)
    {
      
      double r;
      GeneradorCongruencialMixto c = new GeneradorCongruencialMixto();
      r=c.numeroAleatorio();
      int tiempo = (int)(- media* Math.log(r));
      return tiempo;
}
}