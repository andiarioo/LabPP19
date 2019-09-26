import java.util.Scanner;
public class TPraktikumDev10 {

   public static void main(String[] args) {
      System.out.println("Devon");
      Scanner input = new Scanner(System.in);
      int harga = input.nextInt();
      int uang = input.nextInt();
      input.close();
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      int f = 0;
      int g = 0;
      int h = 0;
      int i = 0;
      int j = 0;
      int kembalian = uang - harga;
      if (kembalian<=uang) {
         while(true){
            if (kembalian - 100000 >= 0) {
               kembalian-=100000;
               a++; 

            } else if (kembalian - 50000 >= 0) {
               kembalian-=50000;
               b++;

            } else if (kembalian - 20000 >= 0) {
               kembalian-=20000;
               c++;

            } else if (kembalian - 10000 >= 0) {
               kembalian-=10000;
               d++;

            } else if (kembalian - 5000 >= 0) {
               kembalian-=5000;
               e++;

            } else if (kembalian - 2000 >= 0) {
               kembalian-=2000;
               f++;

            } else if (kembalian - 1000 >= 0) {
               kembalian-=1000;
               g++;

            } else if (kembalian - 500 >= 0) {
               kembalian-=500;
               h++;

            } else if (kembalian - 200 >= 0) {
               kembalian-=200;
               i++;

            } else if (kembalian - 100 >= 0) {
               kembalian-=100;
               j++;

            } else if (kembalian == 0) {
               kembalian-=0;
               break;
      
         }
         }
      }
               System.out.println(a + " uang Rp 100000 ");
               System.out.println(b + " uang Rp 50000 ");
               System.out.println(c + " uang Rp 20000 ");
               System.out.println(d + " uang Rp 10000 ");
               System.out.println(e + " uang Rp 5000 ");
               System.out.println(f + " uang Rp 2000 ");
               System.out.println(g + " uang Rp 1000 ");
               System.out.println(h + " uang Rp 500 ");
               System.out.println(i + " uang Rp 200");
               System.out.println(j + " uang Rp 100");}
      }
   

            
         
      
   

