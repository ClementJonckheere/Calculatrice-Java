import java.util.Scanner;
public class Calculatrice {
    public static boolean restart = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {	

        do {
            System.out.println("Bonjour quel exercice vous intéresse ? : \n"
            + "1 - Addition \n"
            + "2 - Soustraction \n"
            + "3 - Multiplication \n"
            + "4 - Divide \n"
            + "5 - Factorial \n"
            + "5 - Quitter \n");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:  
                    Addition.addition(args);
                    break;
                case 2:
                    Soustraction.soustraction(args);
                    break;
                case 3:
                    Multiplication.multiplication(args);
                    break;
                case 4:
                    Divide.divide(args);
                    break;
                case 5:
                    Factorial.factorial(args);
                    break;
                default:
                    System.out.println("Aurevoir");
                    break;
            }
            sc.nextLine();
            System.out.print("Voulez vous voir un autre exercice ? (true / false) : ");

            boolean choose = sc.nextBoolean();
            restart = choose;
      } while (restart);
      sc.close();
}
}