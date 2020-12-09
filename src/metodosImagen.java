

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class metodosImagen {
    
    public static metodosImagen instance = null;
    public static metodosImagen getInstance() {
        if (instance == null) {
            instance = new metodosImagen();
        }
        return instance;
    }
    
    public ArrayList<Proyecto> proyectosCreados = new ArrayList<>();
    public ArrayList<PluginsProyecto> pluginsCargados = new ArrayList<>();
    
    
    public String imagenP = "";
    
    public void insertarProyecto(String nombreProyecto,String rutaImagenOriginal, String rutaImagenGenerada){
        imagenOriginal io = new imagenOriginal(rutaImagenOriginal);
        imagenGenerada ig = new imagenGenerada(rutaImagenGenerada);
        Proyecto proyectoNuevo = new Proyecto(ig, io, nombreProyecto);
        proyectosCreados.add(proyectoNuevo); 
    }
    
    public Proyecto buscarProyecto(String nombre){
        for (Proyecto var : proyectosCreados) {
            if (var.getNombreProyecto().equals(nombre)) {
                return var;
            }
        }
        return null;
    }
    
    public void cargarArrreglos() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream leyendoProyectos = new ObjectInputStream(new FileInputStream("proyectosG.txt"));
        proyectosCreados = (ArrayList<Proyecto>)leyendoProyectos.readObject();
        leyendoProyectos.close();
        
        ObjectInputStream leyendoPlugins = new ObjectInputStream(new FileInputStream("pluginsG.txt"));
        pluginsCargados = (ArrayList<PluginsProyecto>)leyendoPlugins.readObject();
        leyendoPlugins.close();
        
        
    }
    
    public void guardarArreglos() throws IOException{
        try{
            ObjectOutputStream escribiendoProyectos = new ObjectOutputStream(new FileOutputStream("proyectosG.txt"));               
            escribiendoProyectos.writeObject(proyectosCreados);
            escribiendoProyectos.close();
            
            ObjectOutputStream escribiendoPlugins = new ObjectOutputStream(new FileOutputStream("pluginsG.txt"));               
            escribiendoPlugins.writeObject(pluginsCargados);
            escribiendoPlugins.close();         
        } catch (FileNotFoundException ex) {
            System.out.println("algo fallo en el guardado de serializable");
        }
    }
    
}
