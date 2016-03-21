/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.funcionarios;

import simulartprogect.modelo.Cliente;

/**
 *
 * @author Irene Argollo
 */
public abstract class Funcionario {

    protected boolean disponible;
    private final int code;

    Funcionario(int code) {
        this.code = code;
        disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    protected void cambiarDisponibilidad() {
        disponible = !disponible;
    }

    public abstract void atender(Cliente cliente);
}
