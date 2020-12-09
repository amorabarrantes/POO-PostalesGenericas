
import java.io.Serializable;



public class Proyecto implements Serializable{
    imagenGenerada imagenGenerada;
    imagenOriginal imagenOriginal;
    String nombreProyecto;

    public Proyecto(imagenGenerada imagenGenerada, imagenOriginal imagenOriginal, String nombreProyecto) {
        this.imagenGenerada = imagenGenerada;
        this.imagenOriginal = imagenOriginal;
        this.nombreProyecto = nombreProyecto;
    }

    public imagenGenerada getImagenGenerada() {
        return imagenGenerada;
    }

    public void setImagenGenerada(imagenGenerada imagenGenerada) {
        this.imagenGenerada = imagenGenerada;
    }

    public imagenOriginal getImagenOriginal() {
        return imagenOriginal;
    }

    public void setImagenOriginal(imagenOriginal imagenOriginal) {
        this.imagenOriginal = imagenOriginal;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    
    
}
