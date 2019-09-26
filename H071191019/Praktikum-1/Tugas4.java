import java.util.Scanner;
class Tugas4{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        System.out.printf("Masukkan nilai a = ");       int a = fa.nextInt();
        System.out.printf("Masukkan nilai b = ");       int b = fa.nextInt();
        boolean fa1 = a%b == 0;
        System.out.println("Apakah" + a + "kelipatan dari" + b + "?" + fa1);
    }
}