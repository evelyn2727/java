package sesion02;

import org.junit.Assert;
import org.junit.Test;

public class EjemploMetodoTest {
      @Test
    public void obtenerNombreTest(){
   String nombreActual=EjemploMétodo.obtenerNombre("Evelyn");

          String nombreEsperado="Evelyn";
          Assert.assertEquals(nombreActual,nombreEsperado);

          int suma=EjemploMétodo.obtenerSuma(5,10);
          int sumaEsperada=20;
          Assert.assertEquals(nombreActual,nombreEsperado);

          int multiplicacion=EjemploMétodo.obtenerMultiplicacion(5,10);
          int multiplicacionEsperada=15;
          Assert.assertEquals(nombreActual,nombreEsperado);

      }
}
