import java.util.Scanner;
public class Tugas1{
  public static void main(String[] args) {
    Scanner fa = new Scanner(System.in);

    System.out.print("Masukkan Nilai Pertama: ");
    int firstValue = fa.nextInt();

    System.out.print("Masukkan Nilai Kedua: ");
    int secondValue = fa.nextInt();

    System.out.println("FPB dari " + firstValue + " dan " + secondValue + " = " + nilaiFPB(firstValue,secondValue));
  }
  static int nilaiFPB(int nilai1, int nilai2){
      int nilai3 = 0;
      int nilaiMax = Math.max(nilai1, nilai2);
      int i = nilaiMax;
      while(i > 0){
        i--;
        if(nilai1 % i == 0 && nilai2 % i == 0){
          nilai3 += i;
          break;
        }
    }
    return nilai3;
  }
}
