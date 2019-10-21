import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args) {
		Scanner raf = new Scanner(System.in);
		System.out.println("Silahkan Masukkan input: ");
		int i = raf.nextInt();
		int j = raf.nextInt();
		int k = raf.nextInt();
		int[][] matrixA = new int[i][j];
		int[][] matrixB = new int[j][k];
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matrixA[a][b] = raf.nextInt();

			}
		}
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matrixB[b][c] = raf.nextInt();
			}
		}
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matrixA[a][c] * matrixB[c][b];
				}
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
