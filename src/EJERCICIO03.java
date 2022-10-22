// Crea un método que obtenga la cantidad de dígitos de un número N. Se debe pasar como parámetro el número N

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1111;
        System.out.println(n + " tiene " + digi(n) + " digitos");
    }
    //método que devuelve la cantidad de dígitos de num, num debe ser positivo
    //ejemplo: num = 1111 -> 4
    //ejemplo: num = 45895 -> 5

    static int digi(int num) {
        if (num <= 0) {
            return 0;
        }
        return 1 + digi(num / 10);
    }
}
