import java.util.Scanner;
class rentangXy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if (i%2 == 0 && i > 0) {
                System.out.println(i + " genap positif");
            } else if (i%2 == 1 && i > 0 ) {
                System.out.println(i + " ganjil positif");
            } else if (i%2 == 0 && i < 0 ) {
                System.out.println(i + " genap negatif");
            } else if (i%2 == 1 && i < 0 ) {
                System.out.println(i + " ganjil negatif");
            } else if (i == 0) {
                System.out.println(i + " nol");
            } else {
                System.out.println(i + " ganjil negatif");
            }
        }

        for (int i = y; i <= x; i++) {
            if (i%2 == 0 && i > 0) {
                System.out.println(i + " genap positif");
            } else if (i%2 == 1 && i > 0 ) {
                System.out.println(i + " ganjil positif");
            } else if (i%2 == 0 && i < 0 ) {
                System.out.println(i + " genap negatif");
            } else if (i%2 == 1 && i < 0 ) {
                System.out.println(i + " ganjil negatif");
            } else if (i == 0) {
                System.out.println(i + " nol");
            } else {
                System.out.println(i + " ganjil negatif");
            }
        }
    }
}