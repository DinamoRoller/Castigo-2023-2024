public class Main {
    public static void main(String[] args) {

        short diasEnAño = 365;
        byte horasEnDia = 24;
        byte minutosEnHora = 60;
        byte segundosEnMinuto = 60;

        int segundosEnAño = calcularSegundosEnAño(diasEnAño, horasEnDia, minutosEnHora, segundosEnMinuto);


        System.out.println("El número de segundos en un año es: " + segundosEnAño);
    }

    public static int calcularSegundosEnAño(short diasEnAnio, byte horasEnDia, byte minutosEnHora, byte segundosEnMinuto) {
        int segundosEnAño = diasEnAnio * horasEnDia * minutosEnHora * segundosEnMinuto;
        return segundosEnAño;
    }
}
