import java.util.Scanner;

public class Dois{
    public static void main(String[] args){
// Escreva um programa em Java em que o usuário informe o 
    // seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

    System.out.print("Informe seu nome, por favor: ");
    Scanner in = new Scanner(System.in);
    String nome = in.next();
    System.out.print("Ola, " + nome);

    
    }
    }