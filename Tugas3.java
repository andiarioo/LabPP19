import java.util.Scanner;
public class Tugas3{
	public static void main(String[] args) {
		Scanner raf = new Scanner(System.in);
			System.out.print("Jumlah Pemain : ");
			int player = raf.nextInt();
			int[] coba = new int[3];
			int[] Berhasil = new int[3];
		 	float coba1[] = new float[3];
			float Berhasil1[] = new float[3];
			float totalService = 0;
			float totalBlock = 0;
			float totalSmash = 0;
			for(int i = 0; i < player; i++){System.out.print("Nama Pemain " + i + " : ");
				String name = raf.next();
				for(int j = 0; j < 3;j++){System.out.print("Coba " + j + " : ");
					coba[j] = raf.nextInt();
					coba1[j] += coba[j];

				}
				for(int j = 0; j < 3;j++){System.out.print("Berhasil :" + i + " : ");
				Berhasil[j] = raf.nextInt();
				if(coba[j] < Berhasil[j]){
						System.out.println("Kelebihan Berhasilnya Woi ");
						System.exit(0);

					}
				Berhasil1[j] += Berhasil[j];
				}
				float service = (Berhasil1[0]  * 100) / coba1[0];
				totalService = service;
				float block = (Berhasil1[1] * 100) / coba1[1];
				totalBlock = block;
				float smash = (Berhasil1[2]  * 100) / coba1[2];
				totalSmash = smash;
			}

			System.out.printf("Service: %.2f%%",totalService);
			System.out.println();
			System.out.printf("Block: %.2f%%",totalBlock);
			System.out.println();
			System.out.printf("Smash: %.2f%%",totalSmash);

	}
}
