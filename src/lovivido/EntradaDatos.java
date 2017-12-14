/*
 * Clase que pide los datos del usuario y los devuelve
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author ablancoabalde
 */
public class EntradaDatos {

    /**
     * Metodo que pide el nombre del usuario
     *
     * @return String nombre
     */
    public String devuelveNombre() {

        return JOptionPane.showInputDialog("Escriba su nombre: ");
    }

    /**
     * Metodo que pide el edad del usuario
     *
     * @return int edad
     */
    public int devuelveEdad() {

        return Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad: "));
    }

}
