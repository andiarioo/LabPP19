import java.util.Scanner;
public class Tugas3{
  public static void main(String[] args) {
      Scanner fa = new Scanner(System.in);
      System.out.println("Masukkan Usia dalam hari: ");
      int usia = fa.nextInt();
      tahun(usia);
      bulan(usia);
      hari(usia);
  }
  public static void tahun(int usiaTahun){
    int tahun = usiaTahun / 365;
    System.out.println(tahun + " tahun");
  }
  public static void bulan(int usiaBulan){
    int bulan = (usiaBulan % 365) / 30;
    System.out.println(bulan + " bulan ");
  }
  public static void hari(int usiaHari){
    int hari = (usiaHari % 365) % 30;
    System.out.println(hari + " hari");
  }
}
