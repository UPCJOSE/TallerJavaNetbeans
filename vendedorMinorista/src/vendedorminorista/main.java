/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendedorminorista;

import java.util.Scanner;

/**
 *
 * @author Jlope
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero de elementos almacenados: ");
        int n = leer.nextInt();
        int cant = 0;
        String[] A = new String[n];
        double[] B = new double[n];
        int[] C = new int[n];
        System.out.println("Digite el codigo de los productos vendidos en el dia");
        for (int i = 1; i <= n; i++) {
            A[i] = leer.nextLine();
        }
        System.out.println("Digite el valor Venta de cada producto");
        for (int i = 1; i <= n; i++) {
            B[i] = leer.nextDouble();
        }
        System.out.println("Digite las cantidadades vendidas de cada uno de los productos");
        for (int i = 1; i <= n; i++) {
            C[i] = leer.nextInt();
        }
        System.out.println("Los productos vendidos fueron");

        System.out.println("Total productos vendidos en el dia: " + totalProductoDia(0));
        System.out.println("Total ingreso por venta al dia:" + totalIngresosDia(n));
        System.out.println("Producto mas vendido:" + productoMasVendido(0));
        System.out.println("Producto mas caro vendido:" + productoMasVendido(0));
    }

    public static int totalProductoDia(int n) {
        int[] C = new int[n];
        int totalPD = 0, cont = 0, i;
        for (i = 1; i <= n; i++) {
            int totalC = C[i];
            cont = cont + 1;
            totalPD = cont + totalC;
        }
        return totalPD;
    }

    public static double totalIngresosDia(int n) {
        double[] B = new double[n];
        double totalB = 0;
        for (int i = 1; i <= n; i++) {
            double total = B[i];
            totalB = totalB + total;
        }
        return totalB;
    }

    public static int productoMasVendido(int n) {
        int[] C = new int[n];
        int masVendido = 0;
        for (int i = 1; i == n; i++) {
            masVendido = C[i];
            if(i==masVendido){
               int Pos=i; 
            }
        }
        
        return 0;
    }

}
