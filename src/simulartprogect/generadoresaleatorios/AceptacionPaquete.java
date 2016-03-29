/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import simulartprogect.generadoresaleatorios.Bernoulli;
import simulartprogect.modelo.Cliente.Tipo;

/**
 *
 * @author Andrea
 */
public class AceptacionPaquete {
    public boolean aceptacion(Tipo cliente)
    { boolean res;
      
      double p = 0.0;
     Bernoulli c = new Bernoulli();
      if (cliente.equals(Tipo.DEPORTISTA)) {
          
            p = 0.4;
        } else if (cliente.equals(Tipo.ESTUDIANTE)) {
          
            p = 0.5;
        } else if (cliente.equals(Tipo.TURISTA_EXTRANGERO)) {
          
            p = 0.6;
        } else if (cliente.equals(Tipo.TURISTA_NACIONAL)) {
          
            p = 0.5;
        } else {
            System.out.println("error");
        }
      res = c.aceptacion(p);
      return res;
    }
}
