import java.util.Scanner;

public class Atividadetres{
    public static void main(String[] args){


        //Escreva um programa em Java em que o usuário informe o 
        //seu nome e em seguida o programa perguntará a idade do 
        //usuário. Agora o programa deve exibir a mensagem 
        //"Olá, [NomeDoUsuario], sua idade é [idade]".

        System.out.print("Por favor, informe seu nome: ");
        Scanner in = new Scanner(System.in);
        String nome = in.next();

        System.out.print("Informe sua idade: ");
        int idade = in.nextInt();

        System.out.println("Ola, " + nome + ". Sua idade e " + idade + " anos");

    }
}