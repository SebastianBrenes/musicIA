package main;

import musica.Musica;
import musica.Bachata;
import musica.Regueton;
import musica.Rock;
import musica.Salsa;
import reproductor.Reproductor;

public class Main {
    public static void main(String[] args) {
        Musica salsaSong = new Salsa("cancion de Salsa");
        Musica rockSong = new Rock("cancion de Rock");
        Musica reguetonSong = new Regueton("cancion de Regueton");
        Musica bachataSong = new Bachata("cancion de Bachata");

        Reproductor reproductor = new Reproductor();

        // Genera las canciones del genero especifico
        salsaSong.generarLetra();
        rockSong.generarLetra();
        reguetonSong.generarLetra();
        bachataSong.generarLetra();
        
        // Reproduce la canción 
        reproductor.reproducirCancion(salsaSong);
        reproductor.reproducirCancion(rockSong);
        reproductor.reproducirCancion(reguetonSong);
        reproductor.reproducirCancion(bachataSong);


    }
}
