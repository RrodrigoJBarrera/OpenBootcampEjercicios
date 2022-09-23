public class Main {
    public static void main(String[] args) {

//        Ejercicio usando if
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

//        Ejercicio usando while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }

//        Ejercicio usando do while
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("Valor de numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

//        Ejercicio usando for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de numeroFor: " + numeroFor);
        }

//        Ejercicio usando switch
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Se encuentra en la estacion de Verano");
                break;
            case "otoño":
                System.out.println("Se encuentra en la estacion de otoño");
                break;
            case "invierno":
                System.out.println("Se encuentra en la estacion de invierno");
                break;
            case "primavera":
                System.out.println("Se encuentra en la estacion de primavera");
                break;
            default:
                System.out.println("La variable no corresponde a una estacion del año");
        }
    }

}