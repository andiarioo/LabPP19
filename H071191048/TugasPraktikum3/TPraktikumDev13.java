import java.util.Scanner;
public class TPraktikumDev13 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int a = 0;
    int b = 1;
    int sum = 0;
    for (int i = 0; i < x; i++){
        sum = a + b;
        System.out.print(a + " ");
        a = b;
        b = sum;
    }
    

    }
}