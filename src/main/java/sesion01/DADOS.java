package sesion01;

import java.util.ArrayList;
import java.util.Random;

public class DADOS {
static int constante=5;
    static int espacios=20;
    static  int  acumulaEspacios = 0;

    public static void main(String [] args) {
        tirarDado(1);
    }

    public static void   tirarDado(int contador) {

        Random random = new Random();

        for(int x = contador; x <= constante; x++) {
            int numero = random.nextInt(6) + 1;

            System.out.println("Tiro #"+ x + ": Has lanzado un " + numero);
            espacios(numero,contador);}



    }

    public static void   espacios(int numero,int contador) {


        for(int x = 0; x < espacios; x++) {
            espacios = espacios - numero;
            acumulaEspacios = acumulaEspacios + numero;
            System.out.println("Ahora estás en el espacio " + acumulaEspacios + " y te quedan " + espacios + " más.");
            tirarDado(contador+1);
        }
            if (acumulaEspacios==20 && constante<5) {
                System.out.println("Usted ganó");

            }else if(acumulaEspacios<20) {
                System.out.println("Usted perdió");
            }else { System.out.println("Usted perdió");}




    }
}