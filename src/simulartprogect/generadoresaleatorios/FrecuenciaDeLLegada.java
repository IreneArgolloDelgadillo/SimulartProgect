/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import java.util.Random;

/**
 *
 * @author Irene Argollo
 */
public class FrecuenciaDeLLegada {
    
    public int siguienteTiempoDellegada() {
        Random tiempoMilisegundos = new Random();
        return tiempoMilisegundos.nextInt(100000);
    }
}
