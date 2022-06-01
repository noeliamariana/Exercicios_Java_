import java.util.Scanner;
public class Paralelogramo{
    public static void main(String[] args){

        // Area = base * altura;

        System.out.println("Vamos calculara a area de um paralelogramo!");

        double b,h;
        Scanner in = new Scanner(System.in);


        System.out.print("Por favor, informe a base do paralelogramo: ");
        b = in.nextDouble();

        System.out.print("Por favor, informe a altura do paralelogramo: ");
        h = in.nextDouble();

        double area = b * h;

        System.out.print("A area do paralelogramo e igual a: " + area + " cm");
        
    }

}