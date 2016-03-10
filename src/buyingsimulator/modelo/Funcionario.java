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
public interface Funcionario {
  public void atender(Cliente cliente) ;
  public void recibirNotificacion(Cliente cliente);
}
