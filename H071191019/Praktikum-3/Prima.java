import java.util.Scanner;
class Prima{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        System.out.print("Input nilai = "); int j = fa.nextInt();
        for (int i = 2; i<j; i++){
            if (j % i ==0){
            System.out.println(j + " Bukan Bilangan Prima");
            return;
        }
    }
    System.out.println(j + " = Bilangan Prima");
}
}