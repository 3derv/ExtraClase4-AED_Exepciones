package extraclase4.exepciones.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ElThrow {
    public String file;
    public ElThrow() {

    }
    public void abrirdoc(String _file) {
        String nombreFichero = _file;
        List<String> lineas = new ArrayList();
        //Declarar una variable BufferedReader
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa
            //   un objeto FileReader con el nombre del fichero
            br = new BufferedReader(new FileReader(nombreFichero));
            //Leer la primera línea, guardando en un String
            String texto = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while(texto != null){
                //Hacer lo que sea con la línea leída
                lineas.add(texto);
                //Leer la siguiente línea
                texto = br.readLine();
            }
            for(int k =0; k <=100; k++){
                System.out.println(lineas.get(k));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
            System.out.println("Final de las acciones, el fichero se cerrará");
        }


    }


}
