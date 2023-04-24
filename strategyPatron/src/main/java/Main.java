
public class Main {
    public static void main(String[] args){
        Pato pato = new PatoCanadiense();

        pato.mostrar();
        pato.volar();

        pato = new PatoHule();
        pato.mostrar();
        pato.volar();

    }
}
