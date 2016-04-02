/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.modelo.secciones;

import simulartprogect.modelo.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import simulartprogect.modelo.AdministradorDePaquete;
import simulartprogect.modelo.ColaDeEspera;

/**
 *
 * @author Irene Argollo
 */
public abstract class Seccion extends Thread {

    protected final List<Funcionario> funcionarios;
    protected final AdministradorDePaquete administradorDePaquetes;
    protected ColaDeEspera colaDeEspera;
    protected ImageIcon icon ;

    protected Seccion(AdministradorDePaquete administradorP) {
        funcionarios = new ArrayList<>();
        administradorDePaquetes = administradorP;
    }

    public void aniadirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void quitarFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
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

    public int getCantidadFuncionarios() {
        return funcionarios.size();
    }
    
    public abstract void contratar(int cantidad) ;
    
    public abstract ImageIcon getIcon();
}
