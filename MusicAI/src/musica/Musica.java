package musica;

public abstract class Musica {
    private String titulo;
 

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }


    // Método abstracto para generar letras
    public abstract void generarLetra();
}