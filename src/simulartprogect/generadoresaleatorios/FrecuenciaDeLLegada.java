/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import simulartprogect.generadoresaleatorios.DistribucionExponencial;
import simulartprogect.modelo.Cliente.Tipo;

/**
 *
 * @author Andrea
 */
public class FrecuenciaDeLLegada{

   

    @SuppressWarnings("ConvertToStringSwitch")
    public int obtenerTiempo(Tipo cliente) {
        //1 hora es equivalente a 60000
        DistribucionExponencial tiempo = new DistribucionExponencial();
        int media = 0;
        int res;
        if (cliente.equals(Tipo.DEPORTISTA)) {
            media = 30000;
        } else if (cliente.equals(Tipo.ESTUDIANTE)) {
            media = 60000;
        } else if (cliente.equals(Tipo.TURISTA_EXTRANGERO)) {
            media = 30000;
        } else if (cliente.equals(Tipo.TURISTA_NACIONAL)) {
            media = 15000;
        } else {
            System.out.println("error");
        }

        return res = tiempo.obtenerDE(media);

    }
}
