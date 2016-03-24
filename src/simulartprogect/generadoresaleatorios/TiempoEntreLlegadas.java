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
public class TiempoEntreLlegadas {
    DistribucionExponencial tiempo = new DistribucionExponencial();
    public TiempoEntreLlegadas()
    {
        
    }
    public int obtenerTiempo(String cliente)
    {
     int media=0;
     int res;
     if(cliente.equals("Deportista"))
     {
       media = 20*60000;
      }
     else if(cliente.equals("Turista Nacional"))
     {media = 15*60000;}
     else if(cliente.equals("Turista Extranjero")){media = 30*60000;}
     else if(cliente.equals("Estudiante")){media = 35*60000;}
     else{System.out.println("error");}
   
     return res = tiempo.obtenerDE(media);
     
    }
}
