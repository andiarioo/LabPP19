import java.util.Scanner;

public class TPraktikumDev11 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.print(i + " ");
            if (i % x == 0) {
                System.out.println();
            }
        }

    }
}