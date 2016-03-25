package simulartprogect.generadoresaleatorios;

/**
 *
 * @author Paola
*/
public class TiempoEntreLlegadas {

//    DistribucionExponencial tiempo = new DistribucionExponencial();

    public TiempoEntreLlegadas() {

    }

    public int obtenerTiempo(String cliente) {
        int media;
        int res;
        if (cliente.equals("Deportista")) {
            media = 20;
        } else if (cliente.equals("Turista Nacional")) {
            media = 15;
        } else if (cliente.equals("Turista Extranjero")) {
            media = 30;
        } else if (cliente.equals("Estudiante")) {
            media = 35;
        } else {
            System.out.println("error");
        }

        return 1; //tiempo.obtenerDE(media);

    }

}
