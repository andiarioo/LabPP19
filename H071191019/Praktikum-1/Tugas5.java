import java.util.Scanner;
class Tugas5{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        int a = fa.nextInt();
        int j100000 = a/100000;
        int h100000 = a%100000;
        int j50000 = h100000/50000;
        int h50000 = h100000%50000;
        int j20000 = h50000/20000;
        int h20000 = h50000%20000;
        int j10000 = h20000/10000;
        int h10000 = h20000%10000;
        int j5000 = h10000/5000;
        int h5000 = h10000%5000;
        int j2000 = h5000/2000;
        int h2000 = h5000%2000;
        int j1000 = h2000/1000;
        System.out.println("Jumlah uang Rp.100.000 = " + j100000);
        System.out.println("Jumlah uang Rp.50.000 = " + j50000);
        System.out.println("Jumlah uang Rp.20.000 = " + j20000);
        System.out.println("Jumlah uang Rp.10.000 = " + j10000);
        System.out.println("Jumlah uang Rp.5.000 = " + j5000);
        System.out.println("Jumlah uang Rp.2.000 = " + j2000);
        System.out.println("Jumlah uang Rp.1.000 = " + j1000);
    }
}