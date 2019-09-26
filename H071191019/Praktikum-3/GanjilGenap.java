import java.util.Scanner;

class GanjilGenap {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);
        System.out.print("Input Batas Awal = ");
        int j = fa.nextInt();
        System.out.print("Input Batas Akhir = ");
        int y = fa.nextInt();
        for (int x = j; x <= y; x++) {
            if (x % 2 == 0 && x > 0) {
                System.out.println(x + " Genap Positif");
            } else if (x % 2 == 1 && x > 0) {
                System.out.println(x + " Ganjil Positif");
            } else if (x % 2 == 0 && x < 0) {
                System.out.println(x + " Genap Negatif");
            } else if (x == 0) {
                System.out.println("0 Nol");
            } else {
                System.out.println(x + " Ganjil Negatif");
            }
        }
        for (int x = j; x >= y; x--) {
            if (x % 2 == 0 && x > 0) {
                System.out.println(x + " Genap Positif");
            } else if (x < 0 && x % 2 == 1) {
                System.out.println(x + "Ganjil Negatif");
            } else if (x % 2 == 1 && x > 0) {
                System.out.println(x + " Ganjil Positif");
            } else if (x % 2 == 0 && x < 0) {
                System.out.println(x + " Genap Negatif");
            } else if (x == 0) {
                System.out.println("0 Nol");
            } else {
                System.out.println(x + " Ganjil Negatif");
            }
        }
    }
}