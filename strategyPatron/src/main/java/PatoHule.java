public class PatoHule extends Pato{
    public PatoHule(){
        volador = new VoladorSinAlas();
    }

    public void mostrar(){
        System.out.println("soy un pato hule.");
    }
}
