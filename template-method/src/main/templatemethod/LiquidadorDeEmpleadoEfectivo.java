package main.templatemethod;

import main.model.Empleado;
import main.model.EmpleadoEfectivo;

public class LiquidadorDeEmpleadoEfectivo extends Liquidador {
    @Override
    protected String generarMensaje(int sueldo) {
        String mensaje = "La liquidación generada es un documento impreso. Saldo a liquidar: " + sueldo + ".";
        return mensaje;
    }

    @Override
    protected void imprimir(int sueldo, Empleado e) {
        System.out.println("Imprimiendo el recibo del empleado " + e.getNombre() + "(" + sueldo + ")");
    }

    @Override
    protected int calcularSueldo(Empleado e) {
        EmpleadoEfectivo ef = (EmpleadoEfectivo) e;

        int sueldo = ef.getSueldoBasico() + ef.getPremios() - ef.getDescuentos();

        return sueldo;
    }
}
