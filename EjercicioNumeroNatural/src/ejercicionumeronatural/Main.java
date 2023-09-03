/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionumeronatural;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Ingrese la cantidad de numeros (solo N. enteros)");
        N = sc.nextInt();
        System.out.println("Numero introducido y a superar en la suma : " + N);
        System.out.println("Numero natural mas pequeño de la suma N "+cantidadSuperar(N));
    }

    public static int cantidadSuperar(int N) {
        int suma = 0;
        int numNatural = 1;
        while (suma <= N) {
            suma += numNatural;
            numNatural++;
        }
        return suma;
    }
}
