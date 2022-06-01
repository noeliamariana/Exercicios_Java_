import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args){

        //Calcular a area de um Triangulo
        // Area = (base * altura) /2

        double b,h;
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular a area de um triangulo!");

        System.out.print("Por favor, informe a base do triangulo: ");
        b = in.nextDouble();

        System.out.print("Por favor, informe a altura do triangulo: ");
        h = in.nextDouble();

        double area = b * h / 2;

        System.out.print("A area do triangulo e igual a: " + area + " cm");
        

    
    


    }
}