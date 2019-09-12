import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);
        double efisiensi = 14.0;
        System.out.printf("Waktu tempuh dalam (jam) = ");
        int waktu = fa.nextInt();
        System.out.printf("Kecepatan rata rata (km/jam) = ");
        int v = fa.nextInt();
        double bensin = (waktu*v) / efisiensi;
        System.out.printf("Bensin Yang Digunakan Sebanyak= %.3f", bensin);
    }
}
