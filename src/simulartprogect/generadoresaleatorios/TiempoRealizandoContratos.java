/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import simulartprogect.generadoresaleatorios.DistribucionNormal;
import simulartprogect.modelo.Cliente.Tipo;

/**
 *
 * @author Andrea
 */
public class TiempoRealizandoContratos {
  public int tiempoCont(Tipo cliente)
  {int res=0;
   double niu=0.0;
   double desvEst = 0.0;
   DistribucionNormal tiempo= new DistribucionNormal();
   int k = 10;
   if (cliente.equals(Tipo.DEPORTISTA)){
         niu = 5.2 ;
         desvEst = 2.3;
        } else if (cliente.equals(Tipo.ESTUDIANTE)) {
         niu = 5.7 ;
         desvEst = 3.0 ;
            
        } else if (cliente.equals(Tipo.TURISTA_EXTRANGERO)) {
         niu = 7.0 ;
         desvEst = 2.0 ;
        } else if (cliente.equals(Tipo.TURISTA_NACIONAL)) {
         niu = 5.5 ;
         desvEst = 2.5 ;
        } else {
            System.out.println("error");
        }
  return res = tiempo.obtenerNormal(niu,desvEst,k);
  }
}
