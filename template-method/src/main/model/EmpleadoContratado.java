package main.model;

public class EmpleadoContratado extends Empleado{
    private int tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoContratado(String nombre, String numeroDeCuenta, int tarifaPorHora, int horasTrabajadas) {
        super(nombre, numeroDeCuenta);
        this.setTarifaPorHora(tarifaPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
