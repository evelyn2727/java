package sesion01;

public class EjemploString {

    public static void main(String[] args) {
        String nombre = "Giancarlo"; // apunta a una referencia en memoria
        String nombre2 = new String("GianCArlo"); // apunta  a otra referencia en memoria

        System.out.println(nombre);
        System.out.println(nombre2);

        if (nombre.equalsIgnoreCase(nombre2)) {
            System.out.println("Son tocayos");
        }

    }
}
