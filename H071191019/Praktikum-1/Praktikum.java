import java.util.Scanner;
class Praktikum{
    public static void main(String[] args){
        Scanner fa = new Scanner(System.in);
        int ganjil=0,positif=0,negatif=0,genap=0;
        int a=fa.nextInt();
        int b=fa.nextInt();
        int c=fa.nextInt();
        int d=fa.nextInt();
        int e=fa.nextInt();
        boolean cek;
        // if(a > 0) {
        //   positif++;
        //   if(a % 2 == 0) {
        //     genap++;
        //   } else {
        //     ganjil++;
        //   }
        // } else(a < 0) {
        //   if(a % 2 == 0) {
        //     genap++;
        //   } else {
        //     ganjil++;
        //   }
        // }
        ganjil += a%2 != 0 ? 1 : 1;
        System.out.println(ganjil);
        positif= a>0 ? ++positif:++negatif;
        ganjil = b%2 != 0 ? ++ganjil : ++genap;
        positif= b>0 ? ++positif:++negatif;
        ganjil = c%2 != 0 ? ++ganjil : ++genap;
        positif= c>0 ? ++positif:++negatif;
        ganjil = d%2 != 0 ? ++ganjil : ++genap;
        positif= d>0 ? ++positif:++negatif;
        ganjil = e%2 != 0 ? ++ganjil: ++genap;
        positif= e>0 ? ++positif:++negatif;
        System.out.println("Bilangan Ganjil = " + ganjil);
        System.out.println("Bilangan Genap = " + genap);
        System.out.println("Bilangan Positif = " + positif);
        System.out.println("Bilangan Negatif = " + negatif);
    }
}
