import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de primeros numeros primos que quiera ver:");
        int N = scanner.nextInt();

        int[] primerosPrimos = obtenerPrimerosPrimos(N);

        System.out.println("Los" + N + "primeros numeros primos son:");
        for (int i = 0; i < N; i++) {
            System.out.print(primerosPrimos[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }

    public static int[] obtenerPrimerosPrimos(int N) {
        int[] primos = new int[N];
        int count = 0;

        int num = 2;

        while (count < N) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        return primos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}