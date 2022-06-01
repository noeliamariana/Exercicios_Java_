import java.util.Scanner;

public class Quadrado{
public static void main(String[] args){

 // Quadrado: Area = base x altura

    System.out.println("Vamos calcular a area do quadrado!");

    System.out.print("Por favor, coloque a base do quadrado: ");
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    
    System.out.print("Por favor, coloque a altura do quadrado: ");
    int altura = in.nextInt();

    int area = base * altura;

    System.out.println("A area do quadrado e igual a " +area+ " cm");
    }

}