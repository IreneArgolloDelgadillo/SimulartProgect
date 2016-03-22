package simulartprogect.generadoresaleatorios;


import simulartprogect.modelo.Cliente;
import simulartprogect.modelo.Cliente.Tipo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import simulartprogect.modelo.OyenteDeLlegadaDeCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Irene Argollo
 */
public class GeneradorDeClientes {

    private int ci;
    private List<OyenteDeLlegadaDeCliente> oyentes;

    public GeneradorDeClientes() {
        oyentes = new ArrayList<>();
    }

    public void generarCliente() {
        ci = +1;
        Random r = new Random();
        Tipo tipoCliente = generarTipoCliente(r.nextDouble());
        Cliente cliente = new Cliente(tipoCliente, ci);
        notificar(cliente);
    }

    public void notificar(Cliente cliente) {
        oyentes.stream().forEach(oyente -> {
            oyente.notificarLlegada(cliente);
        });
    }

    public void addOyentes(OyenteDeLlegadaDeCliente seccion) {
        oyentes.add(seccion);
    }

    private Tipo generarTipoCliente(double random) {
        if (Tipo.ESTUDIANTE.getRangoProbabilidadDeLlegada().contiene(random)) {
            return Tipo.ESTUDIANTE;
        } else if (Tipo.DEPORTISTA.getRangoProbabilidadDeLlegada().contiene(random)) {
            return Tipo.DEPORTISTA;
        } else if (Tipo.TURISTA_NACIONAL.getRangoProbabilidadDeLlegada().contiene(random)) {
            return Tipo.TURISTA_NACIONAL;
        } else {
            return Tipo.TURISTA_EXTRANGERO;
        }
    }
}
