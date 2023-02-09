public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
            cliente.setNombre ("Daniel");
            cliente.setEdad ("20");
            cliente.setTelefono("123456789");
            System.out.println(cliente.setNombre());
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    int creditoSolo;

    }

    public void setEdad(String s) {
    }

    public void setTelefono(String s) {
    }
}