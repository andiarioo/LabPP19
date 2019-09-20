import java.util.Scanner;

public class TPraktikumDev7 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);    
    String pokemon1 = input.nextLine();
    String pokemon2  = input.nextLine();
    String elemen1 = input.nextLine();
    String elemen2 = input.nextLine();
    if (elemen1.equals("fire") && elemen2.equals("ice")){
       System.out.println(pokemon1); 
    }else if (elemen1.equals("fire")  && elemen2.equals("electric")){
        System.out.println(pokemon1);
    }else if (elemen1.equals("fire") && elemen2.equals("water")){
        System.out.println(pokemon2);
    }else if (elemen1.equals("ground") && elemen2.equals("fire")){
        System.out.println(pokemon1);
    }else if (elemen1.equals("ground") && elemen2.equals("electric")){
        System.out.println(pokemon1);
    }else if (elemen1.equals("ground") && elemen2.equals("water")){
        System.out.println(pokemon2);
    }else if (elemen1.equals("water") && elemen2.equals("electric")){
        System.out.println(pokemon2);
    }else if (elemen1.equals("water") && elemen2.equals("ice")){
        System.out.println(pokemon2);
    }else if (elemen1.equals("ice") && elemen2.equals("ground")){
        System.out.println(pokemon1);
    }else if (elemen1.equals("ice") && elemen2.equals("electric")){
        System.out.println(pokemon2);
    }else if (elemen1.equals("electric") && elemen2.equals("water")){
        System.out.println(pokemon1);
    }else if (elemen1.equals("fire") && elemen2.equals("fire")){
        System.out.println("draw");
    }else if (elemen1.equals("electric") && elemen2.equals("electric")){
        System.out.println("draw");
    }else if (elemen1.equals("water") && elemen2.equals("water")){
        System.out.println("draw");
    }else if (elemen1.equals("ground") && elemen2.equals("ground")){
        System.out.println("draw");
    }else if (elemen1.equals("ice") && elemen2.equals("ice")){
        System.out.println("draw");
    }        
    }   
}
        
    

