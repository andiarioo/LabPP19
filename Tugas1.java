import java.util.Scanner;

public class Tugas1{
	public static void main(String[] args){
		Scanner fa = new Scanner(System.in);

		System.out.println("Panjang deret: ");
		int deret = fa.nextInt();
		int[] isiDeret = new int[deret];
		for(int i = 0; i < deret; i++){
			isiDeret[i] = fa.nextInt();
		}
		for(int i = 0; i < deret - 1; i++){
			for(int j = i + 1; j < deret; j++){
			 	int angka1 = isiDeret[i];
			 	int angka2 = isiDeret[j];

			 	while(angka1 != angka2){
			 		if(angka1 > angka2){
			 			angka1 = angka1 - angka2;
			 		}
			 		else{
			 			angka2 = angka2 - angka1;
			 		}	
			 	}
			 	if(angka1 == 1){
			 		System.out.println(isiDeret[i] + " " + isiDeret[j]);
			 	}
			}
		}
	}
}