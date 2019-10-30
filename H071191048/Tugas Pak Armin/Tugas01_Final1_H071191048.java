import java.util.Scanner;

public class Tugas01_Final1_H071191048 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] data = new int[n];
        double sum = 0;
        double error[] = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
            sum += data[i];
        }
        sum /= n;
        for (int i = 0; i < n; i++) {
            error[i] = Math.sqrt(Math.pow(sum - data[i], 2));
        }
        System.out.println("--------------------------------------");
        System.out.printf("| No| Data\t| Error\t\t|\n");
        System.out.println("--------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("| %d|\t%d\t| %.3f\t\t|", data[i], i + 1, error[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}