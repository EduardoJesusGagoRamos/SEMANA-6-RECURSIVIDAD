/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJEMPLO;

import java.util.*;

/**
 *
 * @author EDUARDO
 */
public class RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("suma: " + suma(n1, n2));

    }

    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}

