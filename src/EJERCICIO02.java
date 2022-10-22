// Crea un método que imprima los dígitos desde N hasta 1. Se debe pasar como parámetro el número N

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        decre(n);
    }
    //método que imprime dígitos de n hasta 1
    //ejemplo: n=5 -> 54321
    //ejemplo: n=8 -> 87654321

    static void decre(int n) {
        if (n > 0) {
            System.out.print(n);
            decre(n - 1);
        } else {
            System.out.println();
        }
    }
}
