public class Main {
    public static void main(String[] args) {
        Cliente clienteUno = new Cliente(25, "Juan", 1166754589, 1500);
        System.out.println("CLIENTE");
        System.out.println("Nombre: " + clienteUno.nombre);
        System.out.println("Edad: " + clienteUno.edad);
        System.out.println("Telefono: " + clienteUno.telefono);
        System.out.println("Credito: $" + clienteUno.credito);

        System.out.println(" ");
        System.out.println("**************************************");
        System.out.println(" ");

        Trabajador trabajadorUno = new Trabajador(30, "Pablo", 1196368754, 1290);
        System.out.println("TRABAJADOR");
        System.out.println("Nombre: " + trabajadorUno.nombre);
        System.out.println("Edad: " + trabajadorUno.edad);
        System.out.println("Telefono: " +trabajadorUno.telefono);
        System.out.println("Salario: $" + trabajadorUno.salario);
    }

    static class Persona{
        int edad;
        String nombre;
        int telefono;

        public Persona(int edad, String nombre, int telefono) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    static class Cliente extends Persona{
        double credito;

        public Cliente(int edad, String nombre, int telefono, double credito) {
            super(edad, nombre, telefono);
            this.credito = credito;
        }
    }

    static class Trabajador extends Persona{
        private double salario;

        public Trabajador(int edad, String nombre, int telefono, double salario) {
            super(edad, nombre, telefono);
            this.salario = salario;
        }
    }

}