public class Multiplication {
    public static void multiplication(String[] args) {

        // Affiche "Ecrire un nombre: "
        System.out.print("Ecrire un nombre entier: ");
        int nombre1 = Calculatrice.sc.nextInt();
        System.out.print("Ecrire un second nombre entier: ");
        int nombre2 = Calculatrice.sc.nextInt();
        int result = nombre1 * nombre2;
        System.out.println("Resultat de " + nombre1 + "*" + nombre2 + "=" + result);
    }
}
