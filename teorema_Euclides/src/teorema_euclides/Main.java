/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teorema_euclides;

import java.util.Scanner;

/**
 *
 * @author EDUCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para encontrar el MCD con el metodo de Euclides");
        System.out.println("Algoritmo de Euclides de m y n:");
        System.out.println("""
                           transforma un par de enteros positivos (m, n) en una par (d, o), dividiendo repetidamente el entero mayor entre el
                           menor y reemplazando con el resto; cuando el resto es 0, el otro entero de la pareja sera el maximo comun divisor de
                           la pareja original.""");
        System.out.println("Digite el numerador entero positivo: ");
        int m = leer.nextInt();
        System.out.println("Digite el denominador diferente de cero y entero positivo");
        int n = leer.nextInt();
        int resultado = resultadoEuclides(n, m);
        if (n >= m) {
            System.out.println("Error el numero debe ser menor a: " + m);
        } else {
            System.out.println("El maximo comun divisor de " + m + " y " + n + " es: " + resultado);
        }

    }

    public static int resultadoEuclides(int m, int n) {
        while (n != 0) {
            int mod = n;
            n = m % n;
            m = mod;
        }
        return m;
    }
}
