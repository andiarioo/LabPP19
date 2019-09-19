import java.util.Scanner;

class Kondisi {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);
        System.out.printf("Input Nilai X = ");
        int x = fa.nextInt();
        System.out.printf("Input Nilai Y = ");
        int y = fa.nextInt();
        if (x < 0 && y > 0 && Math.abs(x) > y) {
            System.out.println("Berada pada Kuadran 1");
        } else if (x == 0 && y == 0) {
            System.out.println("Berada pada titik pusat (0,0)");
        } else if (x < 0 && y > 0 && Math.abs(x) < y) {
            System.out.println("Berada pada kuadran 2");
        } else if (x > 0 && y > 0 && x < y) {
            System.out.println("Berada di Kuadran 3");
        } else if (x > 0 && y > 0 && x > y) {
            System.out.println("Berada di Kuadran 4");
        } else if (x > 0 && y < 0 && x > Math.abs(y)) {
            System.out.println("Berada di Kuadran 5");
        } else if (x > 0 && y > 0 && x < Math.abs(y)) {
            System.out.println("Berada di Kuadran 6");
        } else if (x < 0 && y < 0 && Math.abs(x) < Math.abs(y)) {
            System.out.println("Berada di Kuadran 7");
        } else if (x < 0 && y < 0 && Math.abs(x) > Math.abs(y)) {
            System.out.println("Berada pad Kuadran 8");
        } else {
            System.out.println("Tepat Di Garis");
        }
    }
}
