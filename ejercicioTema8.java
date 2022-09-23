public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Hernan");
        persona1.setEdad(27);
        persona1.setTelefono("3239290320");
        System.out.println("Nombre: " + persona1.getNombre() + "\nEdad: " + persona1.getEdad() + "\nTelefono: " + persona1.getTelefono());
    }


}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}