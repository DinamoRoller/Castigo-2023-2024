import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo:");
        int numero = scanner.nextInt();

        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.length; i++) {
            System.out.print(factoresPrimos[i]);
            if (i < factoresPrimos.length - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }

    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[10];

        int indice = 0;

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[indice] = i;
                indice++;
                numero /= i;
            }
        }

        int[] resultado = new int[indice];
        for (int i = 0; i < indice; i++) {
            resultado[i] = factoresPrimos[i];
        }

        return resultado;
    }
}