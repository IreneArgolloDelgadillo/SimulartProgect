/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyingsimulator.modelo;

/**
 *
 * @author Irene Argollo
 */
public class Recepcionista implements Funcionario{

    @Override
    public void atender(Cliente cliente) {
        //Dar  informacion al cliente durante determinado tiempo que depende del tipo de cliente
        //al finalizar la atencion el cliente deberia tener en mente cual es el paquete qe desea
    }

    @Override
    public void recibirNotificacion(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
