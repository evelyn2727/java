package sesion02;

import java.util.Scanner;

public class EjemploMétodo {
private static Scanner scanner=new Scanner(System.in);
public static void main(String [] args){
    System.out.println("Ingresa tu nombre : ");

    String nombre1=scanner.next();

    System.out.println("Hola "+ obtenerNombre(nombre1));

    int numero1=5;
    int numero2=5;
    System.out.println("Suma "+ obtenerSuma(numero1,numero2));

    int multiplo1=5;
    int multiplo2=5;
    System.out.println("Multiplicación "+ obtenerMultiplicacion(multiplo1,multiplo2));

}

public static String obtenerNombre(String nombre){

    return nombre;
}

    public static int obtenerSuma(int numero1,int numero2){

        return numero1+numero2;
    }
    public static int obtenerMultiplicacion(int multiplo1,int multiplo2){

        return multiplo1*multiplo2;
    }
}
