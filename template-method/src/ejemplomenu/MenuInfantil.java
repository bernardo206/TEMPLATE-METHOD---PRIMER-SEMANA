package ejemplomenu;

public class MenuInfantil extends Menu{
    private int cantidadDeJuguetes;

    public MenuInfantil(int cantidadDeJuguetes){
        this.setTipo("INFANTIL");
        this.cantidadDeJuguetes = cantidadDeJuguetes;
    }

    public MenuInfantil(){
        this.setTipo("INFANTIL");
    }

    public int getCantidadDeJuguetes() {
        return cantidadDeJuguetes;
    }

    public void setCantidadDeJuguetes(int cantidadDeJuguetes) {
        this.cantidadDeJuguetes = cantidadDeJuguetes;
    }
}
