package extraclase4.exepciones.com;

public class LaExepcionCreada {
    public void ExepcionPropia(int num, int den)throws MiExepcion {
        if (den == 0) {
            throw new MiExepcion("La exepción no es válida ya que su denominador es cero");

        }else {
            System.out.println("La fracción "+num+"/"+den+" es correcta");
        }
    }
}
