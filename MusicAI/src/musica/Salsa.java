package musica;

public class Salsa extends Musica {
    public Salsa(String titulo) {
        super(titulo);
    }

    @Override
    public void generarLetra() {
        System.out.println("Generando letra de Salsa con IA...");
    }
}
