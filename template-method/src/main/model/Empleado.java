package main.model;

public abstract class Empleado {

    private String nombre;
    private String numeroDeCuenta;

    public Empleado(String nombre, String numeroDeCuenta) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
}
