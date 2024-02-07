import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de los vectores: ");
        int N = scanner.nextInt();

        int[] vector1 = leerVector(N, "primer");
        int[] vector2 = leerVector(N, "segundo");

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + productoEscalar);

        scanner.close();
    }

    public static int[] leerVector(int longitud, String ordinal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del " + ordinal + " vector: ");

        int[] vector = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + " : ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}