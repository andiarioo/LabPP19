import java.util.Scanner;
class nomer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lingkaranA = 25; //radius dikuadratkan
        int lingkaranB = 144; //radius dikuadratkan
        int lingakaranC = 400; //radius dikuadratkan
        double radiusKuadrat = Math.pow(x,2) +Math.pow(y,2);
        if (radiusKuadrat <=lingkaranA){
            System.out.println("Di dalam lingkaran A");
        }else if (radiusKuadrat <=lingkaranB){
            System.out.println("Di dalam lingkaran B");
        }else if (radiusKuadrat <= lingakaranC){
            System.out.println("Di dalam lingkaran C");
        }else{
            System.out.println("Diluar lingkaran");
        }

        
    }
}