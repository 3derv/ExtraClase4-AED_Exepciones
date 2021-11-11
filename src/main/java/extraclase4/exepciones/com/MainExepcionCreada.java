/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraclase4.exepciones.com;

/**
 *
 * @author 3der
 */
public class MainExepcionCreada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MiExepcion {
        LaExepcionCreada mixepcion = new LaExepcionCreada();
        mixepcion.ExepcionPropia(120, 0);
    }
    
}
