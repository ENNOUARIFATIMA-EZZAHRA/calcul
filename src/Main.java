import java.util.Scanner;
 


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s;
        double a=0,b=0;
            System.out.println("-------------Menu------------");
            System.out.println("1- Addition (+)");
            System.out.println("2- Soustraction (-)");
            System.out.println("3- Multiplication (*)");
            System.out.println("4- Division (/)");
            System.out.println("5- Puissance");
            System.out.println("6- Racine carrée");
            System.out.println("7- Factorielle");
            System.out.println("0- Quitter");
            System.out.print("Choisir votre choix: ");
            //operateur
            s = sc.nextInt();
            if (s !=0) {
                System.out.print("Donner premier nombre: ");
                a = sc.nextDouble();

                // For all operations except square root and factorial, ask for a second number
                System.out.print("Donner deuxième nombre: ");
                b = sc.nextDouble();
            }
    }

}
