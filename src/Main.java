import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        metodosImagen mi = metodosImagen.getInstance();

        Home hm = new Home();
        
        hm.setVisible(true);
        hm.setLocationRelativeTo(null);

        mi.cargarArrreglos();
    }
}
