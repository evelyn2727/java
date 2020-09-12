package sesion02;

import org.junit.Assert;
import org.junit.Test;
public class EjemploCalificaCredito {

    @Test
    public void obtenerCalificaTest(){
        boolean califica =VerificacionCreditoInstantaneo.esUsuarioCalificado(20000,800);
        boolean esperado=true;
        Assert.assertEquals(califica,esperado);
    }


}
