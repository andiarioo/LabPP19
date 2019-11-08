import java.util.Scanner;
class bilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            System.out.println(i + "Prima" );
        }
    }
}