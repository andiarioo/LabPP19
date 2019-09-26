import java.util.Scanner;;
public class TPraktikumDev14 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    float m = input.nextFloat();
    int jam = 6;
    int menit = 0;
    int detik = (Math.round((m/360)*24*3600));
    
    while(detik>=3600){
        jam++;
        detik-=3600;
        
    } while(detik>=60){
        menit++;
        detik-=60;
    } 
    jam = jam % 24;
    if (jam < 11){
        System.out.println("selamat pagi");
    } else if (jam < 15){
        System.out.println("selamat siang");
    } else if (jam < 18){
        System.out.println("selamat sore");
    } else if (jam < 24){
        System.out.println("selamat malam");
    }
    System.out.print(jam + ":");
    System.out.print(menit + ":");
    System.out.print(detik);
    
    }
}