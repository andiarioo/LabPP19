import java.util.Scanner;
class perkalianMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("-----------------");
        int matriksA[][] = new int[i][j];
        int matriksB[][] = new int[j][k];
        int matriksHasil[][] = new int[i][k];

        //elemen matriks A
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = sc.nextInt();
            }
        }
        System.out.println("-----------------");
        
        //elemen matriks B
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < k; b++) {
                matriksB[a][b] = sc.nextInt();
            }
        }
        System.out.println("-------------------");

        //perkalian matriksnya
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                int z = 0;
                for (int c = 0; c < j; c++) {
                    z = z + matriksA[a][c] * matriksB[c][b];
                }
                matriksHasil[a][b] = z;
            }
        }

        //print hasil
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                System.out.print(matriksHasil[a][b]+" ");
            }
            System.out.println();
        }

    }
}