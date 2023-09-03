/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario.neto;

import java.util.Scanner;

/**
 *
 * @author Jlope
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int HT;
        int HE = 15;
        int HB = 10;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas horas trabajo en la semana: ");
        HT = leer.nextInt();
        int saTot = salarioBruto(HT, HB);
        float saImpNet = impuesto(saTot, HT, HB, HE);
        if (HT <= 38) {
            System.out.println("Su salario es de: " + saTot);
        } else {
            System.out.println("Su salario es de: " + saImpNet);
        }
    }

    public static int salarioBruto(int HT, int HB) {
        int saTot;
        if (HT <= 38) {
            saTot = HT * HB;
        } else {
            int SA = 38 * HB;
            int HE = HT - 38;
            saTot = SA + HE * (HB / 100 * 50);
        }
        return saTot;
    }

    public static float impuesto(int saTot, int HT, int HB, int HE) {
        float saImp;
        float saImpNet=0;
        if (HT <= 75) {
            saImpNet = HB * HT;
        } else {
            saImp = HB * HT;
            float Desc = (saImp - 750)/100*10;
            saImpNet=saImp-Desc;
        }
        return saImpNet;
    }
}
