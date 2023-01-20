public class Factorial {
    public static void factorial(String[] args) {
        // Affiche "Ecrire un nombre: "
        int i = 0;
        int fact = 1;
        System.out.print("Ecrire un nombre entier: ");
        int nombre = Calculatrice.sc.nextInt();
        for(i=1;i<=nombre;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+ nombre + " is: " + fact);   
       }  

}
