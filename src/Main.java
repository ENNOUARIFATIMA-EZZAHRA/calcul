import java.util.Scanner;
 


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s;
        double a,b;
            System.out.println("-------------Menu------------");
                    while (true) {

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
            
          
                
              


            if (s == 0) {
                System.out.println("Au revoir!");
                break;
            }

if (s !=0) {
            System.out.print("Donner premier nombre: ");
             a = sc.nextDouble();

            // Process the operation based on user choice
            if (s != 6 && s != 7) {
                // For all operations except square root and factorial, ask for a second number
                System.out.print("Donner deuxieme nombre: ");
                 b = sc.nextDouble();


                switch (s) {
                    case 1:
                        Addition(a, b);
                        break;
			case 2:
                        Soustraction(a, b);
                        break;
                         default:
                        System.out.println("Choix invalide.");
                }
            }
            
            }
                    }
    }
    public static void Addition(double a, double b) {
        System.out.println("Addition : " + (a + b));
    }
      public static void Soustraction(double a, double b) {
        System.out.println("Soustraction : " + (a - b));
    }

}
