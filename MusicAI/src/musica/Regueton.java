package musica;

public class Regueton extends Musica {
    public Regueton(String titulo) {
        super(titulo);
    }

    @Override
    public void generarLetra() {
        System.out.println("Generando letra de Reguetón con IA...");
    }
}
