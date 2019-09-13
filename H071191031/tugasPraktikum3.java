import java.util.Scanner;
class tugasPraktikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double h = sc.nextInt();
        double a = sc.nextInt();
        double b = sc.nextInt();
        double tanA = Math.tan(Math.toRadians(a))*h;
        double tanB = Math.tan(Math.toRadians(b))*h;
        double hasil = tanA - tanB;
        System.out.printf("Panjang kapal = %.1f m" , hasil);
    }
}