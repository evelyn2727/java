package sesion01;

import java.util.*;

public class Monedas {
    static double constante=1.0;
    static double diferencia;
    static double importe=0;
    static double suma=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double [] monedas={ 0.25, 0.10, 0.05, 0.01};
       double [] cantidad={0,0,0,0};
        for(int i=0;i<monedas.length;i++){
          System.out.print("Ingresa cuántas monedas hay de " + monedas[i]+ ": " );
           Scanner sc=new Scanner(System.in);
            cantidad[i]=sc.nextDouble();
         }
         calcular(monedas,cantidad);


    }

    public static void calcular(double[] monedas,double[] cantidad)
    {


        for(int i=0;i<monedas.length;i++)
        {
            importe=monedas[i]*cantidad[i];
            suma=suma +importe;
            System.out.println("Hay "+ importe);

        }
        System.out.println("SUMA "+ suma);
        if (suma==1.0){
            System.out.println("Usted ganó ");
    }else if(suma>1){

             diferencia=suma-constante;
            System.out.println("Exedió por " + diferencia);

        }else {

             diferencia=constante-suma;
            System.out.println("Le falta " + diferencia);
        }
    }

}
