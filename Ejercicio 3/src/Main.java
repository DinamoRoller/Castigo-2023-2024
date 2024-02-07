public class Main {
    public static void main(String[] args) {
        int[] multiplosDe5 = obtenerMultiplosDe5(1, 100);

        int sumaMultiplosDe5 = sumarArray(multiplosDe5);

        System.out.println("La suma de los multiplos de 5 entre 1 y 100 es: " + sumaMultiplosDe5);


        System.out.println("Cantidad de multiplos de 5 entre 1 y 100: " + multiplosDe5.length);
        System.out.println("Los multiplos de 5 son:");
        for (int i = 0; i < multiplosDe5.length; i++) {
            System.out.println(multiplosDe5[i]);
        }

    }

    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplosDe5 = (end - begin) / 5 + 1;
        int[] multiplosDe5 = new int[cantidadMultiplosDe5];

        for (int i = 0; i < cantidadMultiplosDe5; i++) {
            multiplosDe5[i] = begin + (i * 5);
        }

        return multiplosDe5;
    }

    public static int sumarArray(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return suma;
    }
}