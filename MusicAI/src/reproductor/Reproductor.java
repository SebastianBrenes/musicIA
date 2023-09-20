package reproductor;
import musica.Musica;

public class Reproductor {
    public void reproducirCancion(Musica cancion) {
        System.out.println("Reproduciendo la cancion: " + cancion.getTitulo());
    }
}