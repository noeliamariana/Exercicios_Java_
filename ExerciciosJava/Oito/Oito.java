import java.util.Scanner;

public class Oito{
    public static void main(String[] args){

        // Faça um programa para ler 2 valores informados pelo usuário 
        // E se o segundo valor 
        //  for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor 
        // não pode ser aceito o valor zero nem negativo e imprimir o resultado 
        // da divisão do primeiro valor lido pelo segundo valor lido. 
        
        // double =  x,y;

        System.out.print("Informe o primeiro valor: "); 
        Scanner in = new Scanner(System.in);
        double valor = in.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valordois = in.nextDouble();

        //Enquanto estiver dando falso ele executará
        while(valordois <= 0){
            System.out.print("Por favor, informe outro valor acima de 0: ");
            // System.out.print("Informe o segundo valor: ");
            valordois = in.nextDouble();
        }
         System.out.println("A divisao dos numeros e igual a: " + (valor/valordois));
 }
}