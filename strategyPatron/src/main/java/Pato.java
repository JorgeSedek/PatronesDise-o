

public abstract class Pato {
    Volador volador;

    public Pato(){
        volador = new VoladorSinAlas();
    }

    public void volar(){
        volador.volar();
    }

    public void mostrar(){
        System.out.println("Es un pato.");
    }
}
