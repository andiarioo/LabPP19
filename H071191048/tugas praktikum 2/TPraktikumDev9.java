import java.util.Scanner;
public class TPraktikumDev9 {
    public static void main(String [] args) {
    System.out.println("Hello Devon");
    Scanner input = new Scanner(System.in);
    System.out.println("menu");
    System.out.println("1. mencari luas");
    System.out.println("2. volume bangun ruang");
    System.out.println("input angka sesuai dengan menu yang diinginkan ");
    int a = input.nextInt();
    if (a == 1){
        System.out.println("pilih bangun datar");
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. segitiga");
        System.out.println("4. lingkaran");
        System.out.println("5. jajar genjang");
        System.out.println("6. trapesium");
        System.out.println("7. belah ketupat");
        System.out.println("8. layang-layang");
        System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan : ");
        int bangun = input.nextInt();    
        
        if (bangun == 1){
            int sisi = input.nextInt();
            double luas = sisi*sisi;
            System.out.println("luas persegi adalah = " + luas);

        }else if (bangun == 2){
            int P = input.nextInt();
            int L = input.nextInt();
            double luas = P*L;
            System.out.println("luas persegi panjang adalah = " + luas);
         
        }else if (bangun == 3){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            double luas = (alas*tinggi)/2;
            System.out.println("luas segitiga adalah = " + luas);

        }else if (bangun == 4){
            int r = input.nextInt();
            double phi = 3.14;
            double luas = phi*(Math.pow(r, 2));
            System.out.println("luas lingkaran adalah = " + luas);

        }else if (bangun == 5){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            double luas = alas*tinggi;
            System.out.println("luas jajargenjang adalah = " + luas);

        }else if (bangun == 6){
            int sisi1 = input.nextInt();
            int sisi2 = input.nextInt();
            int tinggi = input.nextInt();
            double luas = (sisi1+sisi2)*tinggi/2;
            System.out.println("luas trapesium adalah = " + luas);

        }else if (bangun == 7){
            int d1 = input.nextInt();
            int d2 = input.nextInt();
            double luas = d1*d2/2;
            System.out.println("luas belah ketupat adalah = " + luas);

        }else if (bangun == 8){
            int d1 = input.nextInt();
            int d2 = input.nextInt();
            double luas = d1*d2/2;
            System.out.println("luas layang-layang adalah = " + luas);
        }
    } if (a == 2){
        System.out.println("pilih bangun datar");
        System.out.println("1. kubus");
        System.out.println("2. balok");
        System.out.println("3. prisma segitiga");
        System.out.println("4. bola");
        System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan : ");
        int bangun = input.nextInt();

        if (bangun == 1){
            int sisi = input.nextInt();
            double volume = Math.pow(sisi, 3);
            System.out.println("volume kubus adalah = " + volume);

        }else if (bangun == 2){
            int P = input.nextInt();
            int L = input.nextInt();
            int tinggi = input.nextInt();
            double volume = P*L*tinggi;
            System.out.println("volume balok adalah = " + volume);

        }else if (bangun == 3){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            int tinggi_prisma = input.nextInt();
            double volume = alas*tinggi*tinggi_prisma/2;
            System.out.println("volume prisma segitiga adalah = " + volume);
        
        }else if (bangun == 4){
            int r = input.nextInt();
            double phi = 3.14;
            double volume = 4*phi*(Math.pow(r, 3))/3;
            System.out.printf("volume bola adalah = %.2f" , volume);
        }
    }

    }
}