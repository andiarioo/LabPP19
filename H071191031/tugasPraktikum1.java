import java.util.Scanner;
class tugasPraktikum1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        int waktu = sc.nextInt();
        int kecepatan = sc.nextInt();
        float jarak = waktu*kecepatan;
        float bensinDigunakan = jarak/14;
        System.out.printf("Jumlah bensin yang digunakan= %.3f L" , bensinDigunakan);
    }
}