public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.agregarPuerta();
        System.out.println("Cantidad de puertas del Objeto: " + coche.puertas);

    }

}

class Coche {
    public int puertas = 0;

    public void agregarPuerta() {
        puertas++;
    }
}
