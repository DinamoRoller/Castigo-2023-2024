import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int tamaño = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(tamaño);

        System.out.println("La matriz simétrica generada es:");
        imprimirMatriz(matriz);

        scanner.close();
    }


    public static int[][] generarMatrizSimetrica(int tamaño) {
        Random rand = new Random();
        int[][] matriz = new int[tamaño][tamaño];


        for (int i = 0; i < tamaño; i++) {
            for (int j = i; j < tamaño; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }


        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < i; j++) {
                matriz[i][j] = matriz[j][i];
            }
        }

        return matriz;
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
