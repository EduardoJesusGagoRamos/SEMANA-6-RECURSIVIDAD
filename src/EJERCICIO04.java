// Crea un método que obtenga el factorial de un número N. Se debe pasar como parámetro el número N

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //obtier factorial de n
        int n = 4;
        System.out.println(n + "! = " + fact(n));
    }
    //método que devuelve el factorial de n
    //ejemplo: n = 4 -> 4x3x2x1

    static int fact(int n) {
        if (n > 1) {
            return n * fact(n - 1);
        } else {
            return 1;
        }
    }
}
