/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.generadoresaleatorios.GeneradorDePaquetes;
import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.secciones.Seccion;

/**
 *
 * @author Irene Argollo
 */
public class Contratista extends Funcionario {

    private final GeneradorDePaquetes generadorAleatorio;
    
    public Contratista(int code, Seccion seccion) {
        super(code, seccion);
        generadorAleatorio = new GeneradorDePaquetes();
        
    }

    @Override
    public void atender(Cliente cliente) {
        super.cambiarDisponibilidad();
        cliente.hacerContrato(generadorAleatorio.definirPaquetes(cliente));
        System.out.println(String.format("Se esta atendiendo al cliente %d", cliente.getCi()));
        super.cambiarDisponibilidad();
    }

}
