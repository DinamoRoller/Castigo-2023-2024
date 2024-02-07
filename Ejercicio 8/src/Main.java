import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = recibirNumerosPorTeclado();

        double media = calcularMedia(numeros);
        System.out.println("La media es: " + media);

        int minimo = calcularMinimo(numeros);
        System.out.println("El mínimo es: " + minimo);

        int maximo = calcularMaximo(numeros);
        System.out.println("El máximo es: " + maximo);
    }

    public static int[] recibirNumerosPorTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca numeros enteros (introduzca 0 para terminar):");
        int[] numeros = new int[100];

        int i = 0;
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros[i] = numero;
            i++;
        }

        int[] resultado = new int[i];
        for (int j = 0; j < i; j++) {
            resultado[j] = numeros[j];
        }
        scanner.close();
        return resultado;
    }

    public static double calcularMedia(int[] numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static int calcularMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    public static int calcularMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
}