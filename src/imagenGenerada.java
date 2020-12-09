import java.io.Serializable;

public class imagenGenerada implements Serializable{
    String ruta;

    public imagenGenerada(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
