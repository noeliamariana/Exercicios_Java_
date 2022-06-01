import java.util.Scanner;
 public class Retangulo{
     public static void main(String[] args){

        //  Considerando a figura acima, escreva um programa para cada forma que calcule
        //  e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar 
        //  os valores de cada variável. Crie um arquivo para cada fórmula e poste os 
        //  arquivos no GitHub. Link do repositório abaixo. 
        // Retângulo: Area = base x altura

        
        System.out.println("Vamos calcular a area do retangulo!");
        
        System.out.print("Por favor, informe a base do retangulo: ");       
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();

        System.out.print("Por favor, informe a altura do retangulo: ");
        int altura = in.nextInt();
        
        int area = altura * base;

        System.out.println("A area e igual: " + area + "cm");


















     }
 }