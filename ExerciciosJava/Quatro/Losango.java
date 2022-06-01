import java.util.Scanner;
public class Losango{
    public static void main(String[] args){

    // Calcular  a área do Losango
    // Area = (Diagonalmaior * diagonalmenor)/2;

    double D,d;
    Scanner in = new Scanner(System.in);

    System.out.println("Vamos calcular a area do Losando!");

    System.out.print("Por favor, informe a Diagonal maior: ");
        D = in.nextDouble();

    System.out.print("Por favor, informe a diagonal menor: ");
        d = in.nextDouble();

    while(d >= D){
    System.out.print("Por favor, informe outro valor para a diagonal menor: ");
        d = in.nextDouble();   
    }    

    double area = ((D * d) / 2);  
   
    System.out.println("A area do losango e igual a " +area+ " cm");      
    }

}