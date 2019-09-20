import java.util.Scanner;
public class TugasPraktikumDev5 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    boolean c = a%b == 0; 
    System.out.println("Apakah a kelipatan b?" + c);
    }
}