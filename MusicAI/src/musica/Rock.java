package musica;

public class Rock extends Musica {
    public Rock(String titulo) {
        super(titulo);
    }

    @Override
    public void generarLetra() {
        System.out.println("Generando letra de Rock con IA...");
    }
}
