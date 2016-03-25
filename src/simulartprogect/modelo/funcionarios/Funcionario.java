/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.Seccion;

/**
 *
 * @author Irene Argollo
 */
public abstract class Funcionario {

    protected boolean disponible;
    protected Seccion seccionSupervisora;
    private final int code;
    
    Funcionario(int code, Seccion seccion) {
        this.code = code;
        disponible = true;
        seccionSupervisora = seccion;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    protected void cambiarDisponibilidad() {
        disponible = !disponible;
    }

    public abstract void atender(Cliente cliente);
}
