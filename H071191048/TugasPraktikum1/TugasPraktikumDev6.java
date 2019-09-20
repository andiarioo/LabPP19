import java.util.Scanner;
public class TugasPraktikumDev6 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
     
    int seratusRibu = a / 100000;
    a %= 100000;
    int limapuluhRibu = a / 50000;
    a %= 50000;
    int duapuluhRibu = a / 20000;
    a %= 20000;
    int sepuluhRibu = a / 10000;
    a %= 10000;
    int limaRibu = a / 5000;
    a %= 5000;
    int seRibu = a / 1000;
    a %= 1000;
    System.out.println(seratusRibu + "jumlah uang 100000");
    System.out.println(limapuluhRibu + "jumlah uang 50000");
    System.out.println(duapuluhRibu + "jumlah uang 20000");
    System.out.println(sepuluhRibu + "jumlah uang 10000");
    System.out.println(limaRibu + "jumlah uang 5000");
    System.out.println(seRibu + "jumlah uang 1000");
    }
}