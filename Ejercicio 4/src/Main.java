import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de numeros enteros positivos. Introduce un numero negativo para terminar");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("El minimo es: " + min);
            System.out.println("El maximo es: " + max);
        } else {
            System.out.println("No se han introducido numeros");
        }

        scanner.close();
    }
}