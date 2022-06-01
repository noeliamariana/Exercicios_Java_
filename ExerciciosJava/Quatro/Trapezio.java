import java.util.Scanner;
public class Trapezio{
    public static void main(String[] args){

    //vamos calcular a área do Trapezio
    // Area = (Basemaior + basemenor) * h /2
    
    double B,b,h;
    Scanner in = new Scanner(System.in);


    System.out.println("Vamos calcular a area do Losando!");

    System.out.print("Por favor, informe a Base maior do trapezio: ");
        B = in.nextDouble();

    System.out.print("Por favor, informe a base menor do trapezio: ");
        b = in.nextDouble();

    System.out.print("Por favor, informe a altura do trapezio: ");
        h = in.nextDouble();

    while(b >= B){
    System.out.print("Por favor, informe outro valor para a base menor do trapezio: ");
        b = in.nextDouble();   
    }    

    double area = (((B + b) * h) / 2);  
   
    System.out.println("A area do trapezio e igual a " +area+ " cm");      
 


 
}
}