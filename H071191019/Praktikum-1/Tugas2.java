import java.util.Scanner;
class Tugas2{
    public static void main(String[] args){
        Scanner fa = new Scanner(System.in);
        System.out.println ("Jumlah Detik");        int detik = fa.nextInt();
        int jam = detik/3600;
        int menit = detik%3600/60;
        int detik1 = detik%3600%60;
        System.out.println(jam + ":" + menit + ":" + detik1);
    }
}