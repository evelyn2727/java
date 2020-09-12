package sesion01;

import java.util.Random;

public class Dados2 {
static int constante=5;
    static int espacios=20;
    static  int  acumulaEspacios = 0;

    public static void main(String [] args) {
        tirarDado(1);
        if(acumulaEspacios==20){System.out.println("HAS GANADO");}
else if(acumulaEspacios<20 || acumulaEspacios>20){System.out.println("HAS PERDIDO");}

    }

    public static void   tirarDado(int contador) {

        Random random = new Random();

        for (int x = contador; x <= constante; x++) {
            int numero = random.nextInt(6) + 1;

            espacios = espacios - numero;
            acumulaEspacios = acumulaEspacios + numero;


            System.out.print("Tiro #" + x + ": Has lanzado un " + numero);
            System.out.println(" Ahora estás en el espacio " + acumulaEspacios + " y te quedan " + espacios + " más.");

        }


    }}