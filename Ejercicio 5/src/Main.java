public class Main {
    public static void main(String[] args) {
        int[][] tablas = obtenerTablasDeMultiplicar(10);

        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del numero " + (i + 1) + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println((i+1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] obtenerTablasDeMultiplicar(int N) {
        int [][] tablas = new int[N][10];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i+1) * (j);
            }
        }
        return tablas;
    }
}