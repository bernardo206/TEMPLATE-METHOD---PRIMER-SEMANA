package main.model;

public class EmpleadoEfectivo extends Empleado{

    private int sueldoBasico;
    private int descuentos;
    private int premios;

    public EmpleadoEfectivo(String nombre, String numeroDeCuenta, int sueldoBasico, int descuentos, int premios) {
        super(nombre, numeroDeCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }
}
