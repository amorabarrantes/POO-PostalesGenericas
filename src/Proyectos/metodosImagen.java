package Proyectos;

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
    
}
