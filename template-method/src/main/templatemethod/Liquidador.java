package main.templatemethod;

import main.model.Empleado;

public abstract class Liquidador {

    public String liquidar(Empleado e){ // Este es un template method
        int sueldo = calcularSueldo(e);
        imprimir(sueldo, e);
        depositar(sueldo, e.getNumeroDeCuenta());

        return generarMensaje(sueldo);
    }

    protected abstract String generarMensaje(int sueldo);

    private void depositar(int sueldo, String numeroDeCuenta) {
        System.out.println("$" + sueldo + " fueron depositados en la cuenta " + numeroDeCuenta);
    }

    protected abstract void imprimir(int sueldo, Empleado e);

    protected abstract int calcularSueldo(Empleado e);

}
