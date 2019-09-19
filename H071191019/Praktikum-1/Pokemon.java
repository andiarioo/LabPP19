import java.util.Scanner;
class Pokemon{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        String pokemon1,pokemon2,elemen1,elemen2;
        System.out.println(" Tulis nama hero anda dan pilih elemen hero anda (Fire / Water / Electric / Ice / Ground)");
        pokemon1 = fa.next();
        elemen1 = fa.next();
        System.out.println(" Tulis nama hero anda dan pilih elemen hero anda (Fire / Water / Electric / Ice / Ground)");
        pokemon2=fa.next();
        elemen2=fa.next();
        switch (elemen1){
            case "fire" :
            switch (elemen2){
                case "ice" :
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric" :
                    System.out.println(pokemon1 + " win");
                    break;
                case "water" :
                    System.out.println(pokemon2 + " Lose");
                    break;
                case "fire":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }break;
            case "ground":
            switch (elemen2){
                case "fire":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println(pokemon1 + " win");
                    break;
                case "water":
                    System.out.println(pokemon2 + " kalah");
                    break;
                case "ground":
                    System.out.println("draw");
                default:
                    System.out.println("wrong");
                    break;
            }break;

            case "electric":
            switch (elemen2){
                case"fire":
                System.out.println(pokemon2 + "win");
                case "water":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
            }break;

            case "water":

            switch(elemen2){
                case "electric":
                    System.out.println(pokemon2 + " win");
                    break;
                case "ice":
                    System.out.println(pokemon2 + " win");
                    break;
                case "water":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }break;

            case "ice":
            switch(elemen2){
                case"ice":
                System.out.println("draw");
                case "ground":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println(pokemon2 + " win");
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }break;
            default:
            System.out.println("Wrong");
        }
    }
}
