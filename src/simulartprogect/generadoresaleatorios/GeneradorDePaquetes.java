/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulartprogect.generadoresaleatorios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import simulartprogect.modelo.AdministradorDePaquete.Tipo;
import simulartprogect.modelo.Cliente;

/**
 *
 * @author Irene Argollo
 */
public class GeneradorDePaquetes {

    private final Cliente cliente;
    private final Cliente.Tipo tipoCliente;
    private final Random generador;

    public GeneradorDePaquetes(Cliente cliente) {
        tipoCliente = cliente.getTipo();
        this.cliente = cliente;
        generador = new Random();
    }

    public Tipo generarTipo() {
        double random = generador.nextDouble();
        if (tipoCliente.getR_probTipoLoc().contiene(random)) {
            return Tipo.LOCAL;
        } else if (tipoCliente.getR_probTipoDep().contiene(random)) {
            return Tipo.DEPORTIVOS;
        } else {
            return Tipo.EXCURCIONES;
        }
    }

    public Map<Tipo, Integer> generarPaquetes(List<Tipo> paquetesDisponibles) {
        Map<Tipo, Integer> paquetesDeInteres = new HashMap<>();
        boolean verMasPaquetes = true;
        while (verMasPaquetes) {
            int cantidad = generador.nextInt();
            Tipo tipoPaquete = generarTipo();
            paquetesDeInteres.put(tipoPaquete, cantidad);
            verMasPaquetes = generador.nextBoolean();
        }
        cliente.setPaquetesinteresados(paquetesDeInteres);
        return paquetesDeInteres;
    }

    public Map<Tipo, Integer> definirPaquetes() {
        Map<Tipo, Integer> paquetesAComprar = cliente.getPaquetes();
        paquetesAComprar.keySet().stream().filter((tipo) -> {
            return generador.nextBoolean();
        }).forEach(paquetesAComprar::remove);
        return paquetesAComprar;
    }
}
