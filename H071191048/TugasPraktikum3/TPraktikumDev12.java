import java.util.Scanner;
public class TPraktikumDev12 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    System.out.println("nilai awal");
    int x = input.nextInt();
    System.out.println("nilai akhir");
    int y = input.nextInt();
    int genap_negatif = 0;
    int ganjil_negatif = 0;
    int nol = 0;
    int ganjil_positif = 0;
    int genap_positif = 0;
    for (int i = x; i <= y; i++){
        if (i %2 == 0 && i > 0){
           System.out.println(i + " genap positif ");
        } else if(i %2 == 0 && i < 0){
           System.out.println(i + " genap negatif "); 
        } else if(i == 0){
           System.out.println(i + " nol ");
        } else if(i %2 != 0 && i > 0){
           System.out.println(i + " ganjil positif ");
        } else if(i %2 != 0 && i < 0){
           System.out.println(i + " ganjil negatif ");
        }   
    } 
       
}
}