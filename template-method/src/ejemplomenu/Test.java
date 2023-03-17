package ejemplomenu;

public class Test {

    public static void main(String[] args) {
        MenuInfantil m = new MenuInfantil();
        MenuInfantil m2 = new MenuInfantil(6);

        m.setCantidadDeJuguetes(5);

        System.out.println(m.getCantidadDeJuguetes());
    }
}
