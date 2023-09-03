/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candidatos_electorales;

/**
 *
 * @author EDUCO
 */
public class Main {

    public static void main(String[] args) {
        // Matriz de votos por comuna y candidato
        int[][] votos = {
            {194, 48, 206, 45},
            {180, 20, 320, 16},
            {221, 90, 140, 20},
            {432, 50, 821, 14},
            {820, 61, 946, 18}
        };

        // Nombres de los candidatos
        String[] candidatos = {"Darling Guevara", "Maria Isabel Campo", "Alvaro Portilla", "Lina De Armas"};

        // Cabeceras de la tabla
        System.out.println("Comuna\tDarling Guevara\t\tMaria Campo\tAlvaro Portilla\t\tLina De Armas\tTotal\tPorcentaje");

        int[] totales = new int[candidatos.length];
        int totalVotos = 0;
        double porcentajeMayor = 0;
        int comunaMayorPorcentaje = -1;

        for (int i = 0; i < votos.length; i++) {
            int totalComuna = 0;
            for (int j = 0; j < votos[i].length; j++) {
                totalComuna += votos[i][j];
                totales[j] += votos[i][j];
            }
            totalVotos += totalComuna;
            double porcentajeComuna = calcularPorcentaje(totalComuna, totalVotos);
            if (porcentajeComuna > porcentajeMayor) {
                porcentajeMayor = porcentajeComuna;
                comunaMayorPorcentaje = i + 1; // Sumar 1 para que coincida con el número de comuna
            }
            System.out.println(i + 1 + "\t\t" + votos[i][0] + "\t\t" + votos[i][1] + "\t\t" + votos[i][2] + "\t\t\t" + votos[i][3]+ "\t\t" + totalComuna + "\t" + porcentajeComuna + "%");
        }
        // Encontrar al candidato más votado
        int votosMaximos = -1;
        int candidatoMasVotado = -1;

        for (int i = 0; i < totales.length; i++) {
            if (totales[i] > votosMaximos) {
                votosMaximos = totales[i];
                candidatoMasVotado = i;
            }
        }
        System.out.println("El candidato mas votado es: " + candidatos[candidatoMasVotado] + " con " + votosMaximos + " votos.");
        double porcentajeCandidatoMasVotado = (double) votosMaximos / totalVotos * 100;
        if (porcentajeCandidatoMasVotado > 50) {
            System.out.println("El candidato mas votado ha ganado con mas del 50% de los votos.");
        }
        System.out.println("La comuna con mayor porcentaje de votacion es la comuna " + comunaMayorPorcentaje
                + " con un porcentaje de " + porcentajeMayor + "%.");
    }

    public static double calcularPorcentaje(int totalComuna, int totalVotos) {
        double porcentajeComuna = (double) totalComuna / totalVotos * 100;
        return porcentajeComuna;
    }
}
