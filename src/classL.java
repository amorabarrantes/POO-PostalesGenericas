import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class classL {

    public void invokeClassMethod(String classBinName, String pathDeImagen) {
        try {

            // Create a new JavaClassLoader 
            ClassLoader classLoader = this.getClass().getClassLoader();

            // Load the target class using its binary name
            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            // Create a new instance from the loaded class
            Constructor<?> constructor = loadedMyClass.getConstructor();
            Plugin myClassObject = (Plugin) constructor.newInstance();

            myClassObject.loadFile(pathDeImagen);
            // Getting the target method from the loaded class and invoke it using its name
            //Method method = loadedMyClass.getMethod(methodName);
            //System.out.println("Invoked method name: " + method.getName());
            //method.invoke(myClassObject);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
        }

    }
}
