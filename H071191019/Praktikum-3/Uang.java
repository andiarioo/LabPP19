import java.util.Scanner;
class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaBarang = sc.nextInt();
        int uangBayar = sc.nextInt();
        int kembalian = uangBayar-hargaBarang;
            int p=0;
            int q=0;
            int r=0;
            int s=0;
            int t=0;
            int u=0;
            int v=0;

        if (hargaBarang>uangBayar){
            System.out.println("Uang anda kurang " + (hargaBarang-uangBayar));
        } else {

        while(kembalian!=0 && kembalian >= 1000){
            if(kembalian%100000 != kembalian){
                p++;
                kembalian=kembalian-100000;
            }else if(kembalian%50000!= kembalian){
                q++;
                kembalian=kembalian-50000;
            }else if(kembalian%20000!= kembalian){
                r++;
                kembalian=kembalian-20000;
            }else if(kembalian%10000!= kembalian){
                s++;
                kembalian=kembalian-10000;
            }else if(kembalian%5000!= kembalian){
                t++;
                kembalian=kembalian-5000;
            }else if(kembalian%2000!= kembalian){
                u++;
                kembalian=kembalian-2000;
            }else if(kembalian%1000!= kembalian){
                v++;
                kembalian=kembalian-1000;
            }
        }
        System.out.printf("%d uang Rp100.000", p);
        System.out.printf("\n%d uang Rp50.000", q);
        System.out.printf("\n%d uang Rp20.000", r);
        System.out.printf("\n%d uang Rp10.000", s);
        System.out.printf("\n%d uang Rp5.000", t);
        System.out.printf("\n%d uang Rp2.000", u);
        System.out.printf("\n%d uang Rp1.000", v);
        }
    }
}