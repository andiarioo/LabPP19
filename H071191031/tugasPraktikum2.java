import java.util.Scanner;
class tugasPraktikum2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        int inputDetik = sc.nextInt();
        int jam = inputDetik/3600;
        int sisaJam = inputDetik%3600;
        int menit = sisaJam/60;
        int detik = sisaJam%60;
        System.out.println(jam +":"+ menit +":"+ detik);
    }
}