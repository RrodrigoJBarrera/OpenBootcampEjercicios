public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Marcos";
        cliente.edad = 39;
        cliente.telefono = "29301903";
        cliente.credito = 23981;
        System.out.println("Nombre: " + cliente.nombre + "\nEdad: " + cliente.edad + "\nTelefono: " + cliente.telefono + "\nCredito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Julio";
        trabajador.edad = 59;
        trabajador.telefono = "33419101";
        trabajador.salario = 345;
        System.out.println("Nombre: " + trabajador.nombre + "\nEdad: " + trabajador.edad + "\nTelefono: " + trabajador.telefono + "\nSalario: " + trabajador.salario);

    }


}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
