public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Pedro";
        cliente1.edad = 45;
        cliente1.telefono = 1123233232;
        cliente1.credito = 14000;

        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Juan";
        trabajador1.edad = 45;
        trabajador1.telefono = 1123233232;
        trabajador1.salario = 140000;

        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);
    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}