import java.util.Scanner;
class TugasPraktikumDev3{
    public static void main(String [] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        
        Math.tan(Math.toRadians(a));
        Math.tan(Math.toRadians(b));
        
        double x = Math.tan(Math.toRadians(a))*h;
        double y = Math.tan(Math.toRadians(b))*h;
        System.out.printf("%.1f m",x-y); 

    }
}