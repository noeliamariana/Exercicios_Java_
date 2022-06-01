import java.util.Scanner;

public class Circulo{
    public static void main(String[] args){

        // Calcular a área de um circulo
        // Area = pi . r ^2

        double pi = 3.14;
        double r;
        Scanner in = new Scanner(System.in);


        System.out.println("Vamos calcular a area de um circulo!");

        System.out.print("Por favor, informe o raio do circulo: ");
        r = in.nextDouble();

        
        double area = pi * (r*r) ;

        System.out.print("A area do circulo e igual a: " + area + " cm");
        

    
    


    }
}