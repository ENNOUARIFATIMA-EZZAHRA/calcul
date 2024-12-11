import java.util.Scanner;

public class Main {


    public static void Addition(double a, double b) {
        System.out.println("Addition : " + (a + b));
    }

    public static void Soustraction(double a, double b) {
        System.out.println("Soustraction : " + (a - b));
    }

    public static void Multiplication(double a, double b) {
        System.out.println("Multiplication : " + (a * b));
    }
    public static void Division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro.");
        } else {
            System.out.println("Division : " + (a / b));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s;
        double a=0,b=0;

        do {

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


            switch (s) {
                case 0:
                    System.out.println("Au revoir!");
                    break;
                case 1:
                    Addition(a, b);
                    break;
                case 2:
                    Soustraction(a, b);
                    break;
                    case 3:
                        Multiplication(a, b);
                        break;
//                    case 4:
//                        Division(a, b);
//                        break;
//                    case 5:
//                        Puissance(a, b);
//                        break;

                default:
                    System.out.println("Choix invalide.");

            }

        }while(s !=0);

        sc.close();
    }

    // Close the scanner after use to avoid resource leak


}
