/*
 * Clase en la que se visualizan los datos
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author ablancoabalde
 */
public class Visualizacion {

    Calculos calc=new Calculos();
    EntradaDatos ed=new EntradaDatos();

    /**
     * Metodo que muestra por pantalla los resultados
     */
    public void visualizar() {
        /**
         * Creo una variable String que recibe un nombre por pantalla y lo
         * almacena
         */
        String nombre=ed.devuelveNombre();
        /**
         * Creo una variable int que recibe una edad por pantalla y la almacena
         */
        int edad=ed.devuelveEdad();
        /**
         * Se muestra por pantalla los resultados de los calculos de Meses, Días
         * y Horas, realizados en la clase Calculos
         */
        for (int i=0; i<=2; i++) {
            if (i==0) {
                JOptionPane.showMessageDialog(null, "Meses: "+calc.calcMeses(edad), "Numero de meses vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);
            } else if (i==1) {
                JOptionPane.showMessageDialog(null, "Días: "+calc.calcDias(edad), "Numero de días vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Horas: "+calc.calcHoras(calc.calcDias(edad)), "Numero de horas vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }

}
