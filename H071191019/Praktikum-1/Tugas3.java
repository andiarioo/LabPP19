import java.util.Scanner;
class Tugas3{
    public static void main(String[] args){
        Scanner fa = new Scanner(System.in);
        System.out.printf("Tinggi menara =");     int h = fa.nextInt();
        System.out.printf("Sudut elevasi dari menara ke depan kapal =");     int b = fa.nextInt();
        System.out.printf("Sudut elevasi dari menara ke belakang kapal =");       int a = fa.nextInt();
        double jarakDepan = Math.tan(Math.toRadians(b))*h;
        double jarakBelakangKeMenara = Math.tan(Math.toRadians(a))*h;
        double hasil = jarakDepan - jarakBelakangKeMenara;
        System.out.printf("panjang kapal = %.1f m", hasil);
    }
}