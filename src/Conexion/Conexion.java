package Conexion;

import Main.Main;
import Proyectos.metodosImagen;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    metodosImagen mi = metodosImagen.getInstance();
    
    public void conexion(String nombreProyecto, String rutaImagen, String tipoLetra, String tamanoLetra, String color, String textoSuperior, String textoInferior) {
        try {
            /*
            System.out.println("ruta imagen: " + rutaGuardado);
            System.out.println("Tipoletra: " + tipoLetra);
            System.out.println("Tamano letra: " + tamanoLetra);
            System.out.println("Color: " + color);
            System.out.println("TextoSuperior: " + textoSuperior);
            System.out.println("TextoInferior: " + textoInferior);
            */
            String rutaGuardado = "C:\\Users\\ExtremeTech\\Desktop\\TEC\\4to Semestre\\Lenguajes\\ParadigmaOO\\Proyecto4\\proyectosCreados\\"+nombreProyecto+"Generado.jpg";
            Process process = new ProcessBuilder("C:\\Users\\ExtremeTech\\CLionProjects\\Postales\\cmake-build-debug\\Postales.exe",rutaImagen,
                    tipoLetra,tamanoLetra, textoSuperior,textoInferior, color, rutaGuardado).start();
            
            mi.insertarProyecto(nombreProyecto, rutaImagen, rutaGuardado);
            
            System.out.println("creado correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
