import java.util.Scanner;

class TPraktikumDev2 {

    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = n / 3600;
        double sisa_x = n % 3600;
        int y = (int) sisa_x / 60;
        double sisa_y = sisa_x % 60;
        int z = (int) sisa_y;
        System.out.printf("%d:%d:%d", x, y, z);
    }
}