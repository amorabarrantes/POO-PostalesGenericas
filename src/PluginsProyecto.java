
import java.io.Serializable;

public class PluginsProyecto implements Serializable{
    private String nombre;

    public PluginsProyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
