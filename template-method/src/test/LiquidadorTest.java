package test;

import main.model.Empleado;
import main.model.EmpleadoContratado;
import main.model.EmpleadoEfectivo;
import main.templatemethod.Liquidador;
import main.templatemethod.LiquidadorDeEmpleadoContratado;
import main.templatemethod.LiquidadorDeEmpleadoEfectivo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LiquidadorTest {

    @Test
    public void deberiaLiquidarCorrectamenteUnEmpleadoEfectivo(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorDeEmpleadoEfectivo();
        Empleado e = new EmpleadoEfectivo("Martín Martini", "abc123", 400, 40, 60);
        String mensajeEsperado = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.";

        //CUANDO
        String mensajeObtenido = sujetoDePrueba.liquidar(e);

        //ENTONCES
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }

    @Test
    public void deberiaLiquidarCorrectamenteUnEmpleadoContratado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorDeEmpleadoContratado();
        Empleado e = new EmpleadoContratado("Pompilia Pompini", "abc123", 120, 7);
        String mensajeEsperado = "La liquidación generada es un documento digital. Saldo a liquidar: 840.";

        //CUANDO
        String mensajeObtenido = sujetoDePrueba.liquidar(e);

        //ENTONCES
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }

}