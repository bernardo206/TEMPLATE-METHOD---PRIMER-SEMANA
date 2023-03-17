package ejemplomenu;

public abstract class ProcesadorDeMenu {
    public String armarMenu(Menu m){ //Template Method
        int precio = calcularElPrecio(m);
        String mensaje = armarMensaje(m, precio);

        return mensaje;
    }

    private String armarMensaje(Menu m, int precio) {
        return "El menu " + m.getTipo() + "tiene un precio de " + precio;
    }

    protected abstract int calcularElPrecio(Menu m);
}
