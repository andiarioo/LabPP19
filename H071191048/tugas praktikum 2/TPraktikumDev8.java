import java.util.Scanner;
public class TPraktikumDev8 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    String x = input.nextLine();
    String y = input.nextLine();
    String z = input.nextLine();
    
    if (x.equals("invertebrado") && y.equals("inseto") && z.equals("hematofago")){
        System.out.println("pulga");        
    } else if (x.equals("invertebrado") && y.equals("inseto") && z.equals("herbivora")){
        System.out.println("lagarta");
    } else if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("hematofago")){
        System.out.println("sanguessuga");
    } else if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("onivoro")){
        System.out.println("minhoca");
    } else if (x.equals("vertebrado") && y.equals("ave") && z.equals("carnivora")){
        System.out.println("agula");
    } else if (x.equals("vertebrado") && y.equals("ave") && z.equals("onivoro")){
        System.out.println("pomba");
    } else if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("onivoro")){
        System.out.println("homem");
    } else if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("herbivora")){
        System.out.println("vaca");
    } else if (x.equals("vertebrado") && y.equals("inseto") && z.equals("carnivora")){
        System.out.println("invalid input");
    } else if (x.equals("invertebrado") && y.equals("ave") && z.equals("herbivora")){
        System.out.println("invalid input");
    } else if (x.equals("vertebrado") && y.equals("inseto") && z.equals("onivoro")){
        System.out.println("invalid input");
    }
}
}