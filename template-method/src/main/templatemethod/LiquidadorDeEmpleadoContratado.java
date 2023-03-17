package main.templatemethod;

import main.model.Empleado;
import main.model.EmpleadoContratado;

public class LiquidadorDeEmpleadoContratado extends Liquidador {
    @Override
    protected String generarMensaje(int sueldo) {
        String mensaje = "La liquidación generada es un documento digital. Saldo a liquidar: " + sueldo + ".";
        return mensaje;
    }

    @Override
    protected void imprimir(int sueldo, Empleado e) {
        System.out.println("Generando el recibo digital del empleado " + e.getNombre() + "(" + sueldo + ")");
    }

    @Override
    protected int calcularSueldo(Empleado e) {
        EmpleadoContratado ec = (EmpleadoContratado) e;

        int sueldo = ec.getTarifaPorHora() * ec.getHorasTrabajadas();

        return sueldo;
    }
}
