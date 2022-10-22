// Crea un método que compruebe si una palabra es un palíndromo

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //palabra analizada
        String s = "reconocer";
        if (palin(s)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
    //método que comprueba si una palabra es un palíndromo
    //ejemplo: reconocer -> true

    public static boolean palin(String frase) {
        frase = frase.toLowerCase();
        if (frase.length() <= 1) {
            return true;
        } else {
            if (frase.charAt(0) == frase.charAt(frase.length() - 1)) {
                return palin(frase.substring(1, frase.length() - 1));
            } else {
                return false;
            }
        }
    }
}
