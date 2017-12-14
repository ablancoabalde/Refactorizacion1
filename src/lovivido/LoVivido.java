package lovivido;

/**
 * Ejercicio1: Refactorización y JavaDOC
 *
 * @author ablancoabalde
 */
import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        /**
         * Instancio una variable de la clase Visualizacion, para hacer la
         * llamada al metodo visualizar
         */
        Visualizacion visu=new Visualizacion();

        visu.visualizar();

        System.exit(0);

    }

}
