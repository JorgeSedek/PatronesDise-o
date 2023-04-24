public class PatoCriollo extends Pato{
    public PatoCriollo(){
        volador = new VoladorConAlas();
    }

    public void mostrar(){
        System.out.println("soy un pato criollo.");
    }
}
