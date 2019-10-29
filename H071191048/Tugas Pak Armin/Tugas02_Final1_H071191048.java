import java.util.Scanner;
public class Tugas02_Final1_H071191048 {
    public static void main(String[] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan input a = ");
    int a = input.nextInt();
    System.out.println("masukkan input b = ");
    int b = input.nextInt();
    System.out.println("masukkan input c = ");
    int c = input.nextInt();
    System.out.println("masukkan input d = ");
    int d = input.nextInt();
    int matriks_A [][]= new int [a][b];
    int matriks_B [][]= new int [c][d];
    int matriks_hasil[][] = new int [a][d];
    int matriks_hasil2[][] = new int [c][b];

    // masukkan input elemen Matriks_A
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            System.out.printf("A[%d,%d] = ",i,j);
            matriks_A[i][j] = input.nextInt();
        }
    }
    System.out.println();
    // masukkan input elemen Matriks_B
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < d; j++) {
            System.out.printf("B[%d,%d] = ",i,j);
            matriks_B[i][j] = input.nextInt();
        }
    }
    if (b != c){
        System.out.println("Tidak Bisa Dilakukan Perkalian AB");
    } else {
        System.out.println("Matriks AB\n");
    }
    // Perkalian AB
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < d; j++) {
            for (int k = 0; k < b; k++) {
                matriks_hasil[i][j] = matriks_A[i][k] * matriks_B[k][j];
            }
            System.out.print(matriks_hasil[i][j] + " ");
        }
        System.out.println();
    }
    
    if (d != a){
        System.out.println("Tidak Bisa Dilakukan Perkalian BA");
    } else{ 
        System.out.println("\nMatriks BA\n");
    }
    // Perkalian BA
    
    for (int i = 0; i < c ; i++) {
        for (int j = 0; j < b; j++) {
            for (int k = 0; k < a; k++) {
                matriks_hasil2[i][j] = matriks_B[i][k] * matriks_A[k][j];  
            }
            System.out.print(matriks_hasil2[i][j] + " ");
        }
        System.out.println();
    }
    }
}