/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo;

import simulartprogect.modelo.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene Argollo
 */
public class Seccion extends Thread {

    private final TipoDeOperacion operacion;
    private final List<Funcionario> funcionarios;
    private ColaDeEspera colaDeEspera;
    private AdministradorDePaquete administradorDePaquetes;

    public Seccion(TipoDeOperacion operacion) {
        this.operacion = operacion;
        funcionarios = new ArrayList<>();
    }

    public void aniadirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void quitarFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void setAdministradorDePaquetes(AdministradorDePaquete administradorDePaquetes) {
        this.administradorDePaquetes = administradorDePaquetes;
    }

    public TipoDeOperacion getOperacion() {
        return operacion;
    }

    public AdministradorDePaquete getAdministradorDePaquetes() {
        return administradorDePaquetes;
    }

    @Override
    public void run() {
        funcionarios.stream().forEach(funcionario -> {
            if (funcionario.estaDisponible()) {
                funcionario.atender(colaDeEspera.siguienteCliente());
            }
        });
    }
}
