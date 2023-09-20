package musica;

public class Bachata extends Musica {
    public Bachata(String titulo) {
        super(titulo);
    }

    @Override
    public void generarLetra() {
        System.out.println("Generando letra de Bachata con IA...");
    }
}