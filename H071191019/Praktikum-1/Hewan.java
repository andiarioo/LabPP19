import java.util.Scanner;
import java.util.InputMismatchException;

class Hewan{
    public static void main(String[]args){
        Scanner fa = new Scanner(System.in);
        String hewan1 = fa.nextLine();
        String hewan2 = fa.nextLine();
        String hewan3 = fa.nextLine();

        try{
            if (hewan1.equals("vertebrado")){
                if (hewan2.equals("ave")){
                    if(hewan3.equals("carnivo")){
                        System.out.println("agula");
                    }else{
                        System.out.println("pomba");
                    }
                }else if (hewan2.equals("mamifero")){
                    if (hewan3.equals("ornivo")){
                        System.out.println("homem");
                    }else{
                        System.out.println("vaca");
                    }
                }
            
            }else if (hewan1.equals("invertebrado")){
                if (hewan2.equals("inseto")){
                    if (hewan3.equals("hematofago")){
                        System.out.println("pulga");
                    }else{
                        System.out.println("lagarta");
                    }
                }else if (hewan2.equals("anelideo")){
                    if (hewan3.equals("hematofago")){
                        System.out.println("sanguessuga");
                    }else{
                        System.out.println("minhoca");
                    }
                }
            }
        
        }catch (InputMismatchException ime){
            System.out.println("input tidak valid");
        }
    }
} 

