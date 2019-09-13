import java.util.Scanner;

class TPraktikumDev {

    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        System.out.println("waktu yang ditempuh (jam)");
        int waktu = input.nextInt();
        System.out.println("kecepatan rata-rata (km/jam)");
        int kecepatan = input.nextInt();
        double bensin_yang_digunakan = waktu * kecepatan / 14.0;
        System.out.printf("bensin yang digunakan = %.3f L", bensin_yang_digunakan);
    }
}