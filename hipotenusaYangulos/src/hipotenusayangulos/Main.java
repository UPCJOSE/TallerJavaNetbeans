/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusayangulos;

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
        // TODO code application logic here
        double CA, CO;
        int noventa = 90;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el cateto opuesto 'CO' del triangulo rectangulo ");
        CO = leer.nextDouble();
        System.out.println("Digite el cateto adyacente 'CA' del triangulo rectangulo ");
        CA = leer.nextDouble();
        double hipotenusa = hipotenusaTriangulo(CA, CO);
        System.out.println("la hipotenusa es: " + hipotenusa);
        double angulo1 = anguloA(CA, CO);
        System.out.println("El angulo a es: " + angulo1);
        double angulo2 = anguloB(CO, CA);
        System.out.println("El angulo b es: " + angulo2);
        System.out.println("El angulo c es: " + noventa);
    }

    public static double hipotenusaTriangulo(double CA, double CO) {
        double hipotenusa;
        hipotenusa = Math.pow(CO, 2) + Math.pow(CA, 2);
        Math.pow(hipotenusa, 2);
        hipotenusa = Math.sqrt(hipotenusa);
        return hipotenusa;
    }

    public static double anguloA(double CA, double CO) {
        double angA = (CA / CO);
        double rad=Math.atan(angA);//angulos agudos a radianes
        double gradosA=Math.toDegrees(rad);//radianes a grados
        return gradosA;
    }

    public static double anguloB(double CO, double CA) {
        double angB =(CO / CA);
        double rad=Math.atan(angB);
        double gradosB=Math.toDegrees(rad);
        return gradosB;
    }
}
