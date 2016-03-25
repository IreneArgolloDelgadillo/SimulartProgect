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
import simulartprogect.modelo.AdministradorDePaquete.TipoPaquete;
import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.Cliente.Tipo;

/**
 *
 * @author Irene Argollo
 */
public class GeneradorDePaquetes {

    private final Random generador;

    public GeneradorDePaquetes() {
        generador = new Random();
    }

    public TipoPaquete generarTipo(Tipo tipoCliente) {
        double random = generador.nextDouble();
        if (tipoCliente.getR_probTipoLoc().contiene(random)) {
            return TipoPaquete.LOCAL;
        } else if (tipoCliente.getR_probTipoDep().contiene(random)) {
            return TipoPaquete.DEPORTIVOS;
        } else {
            return TipoPaquete.EXCURCIONES;
        }
    }

    public Map<TipoPaquete, Integer> generarPaquetes(List<TipoPaquete> paquetesDisponibles, Cliente cliente) {
        Map<TipoPaquete, Integer> paquetesDeInteres = new HashMap<>();
        boolean verMasPaquetes = true;
        while (verMasPaquetes) {
            int cantidad = generador.nextInt();
            TipoPaquete tipoPaquete = generarTipo(cliente.getTipo());
            paquetesDeInteres.put(tipoPaquete, cantidad);
            verMasPaquetes = generador.nextBoolean();
        }
        return paquetesDeInteres;
    }

    public Map<TipoPaquete, Integer> definirPaquetes(Cliente cliente) {
        Map<TipoPaquete, Integer> paquetesAComprar = cliente.getPaquetes();
        paquetesAComprar.keySet().stream().filter((tipo) -> (generador.nextBoolean())).forEach((tipo) -> {
            paquetesAComprar.remove(tipo);
        });
        return paquetesAComprar;
    }
}
