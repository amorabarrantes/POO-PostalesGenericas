import java.io.Serializable;

public class imagenOriginal implements Serializable{
    String ruta;

    public imagenOriginal(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
