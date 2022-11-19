public class ejercicio9 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("pancho");
        cliente.setEdad(23);
        cliente.setTelefono(1234);
        cliente.setCredito(4000);

        System.out.print("hola soy " + cliente.getNombre());
        System.out.print(" mi edad es " + cliente.getEdad());
        System.out.print(" mi telefono es " + cliente.getTelefono());
        System.out.print(" y mi credito es " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("ignacio");
        trabajador.setEdad(22);
        trabajador.setTelefono(4321);
        trabajador.setSalario(3000);

        System.out.print("\n hola soy " + trabajador.getNombre());
        System.out.print(" mi edad es " + trabajador.getEdad());
        System.out.print(" mi telefono es " + trabajador.getTelefono());
        System.out.print(" y mi salario es " + trabajador.getSalario());

    }
  
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}
