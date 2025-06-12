/*

LENDO E IMPRIMINDO TEXTOS E NÚMEROS (j0011)

Faça um programa que peça o nome, idade e cidade de nascimento do usuário. Em seguida,
imprima a frase abaixo trocando as tag’s <nome>, <idade>, <cidade>, pelo nome, idade e
cidade informado pelo usuário.

"Ola. Meu nome é <nome>, sou natural de <cidade>, tenho <idade>, anos
e estou aprendendo a programar."

*/

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        /*
          pedir pro usuário informar:
             - nome
             - idade
             - cidade
        */
        //armazenar as informações do usuário em variáveis
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = in.nextInt();

        System.out.println("Informe a sua cidade de nascimento: ");
        String cidade = in.next();

        //alterar a frase do enunciado
        //"Ola. Meu nome é <nome>, sou natural de <cidade>, tenho <idade> anos,
        //e estou aprendendo a programar."
        System.out.print("Ola. Meu nome é "+nome);
        System.out.print(", sou natural de "+cidade);
        System.out.print(", tenho "+idade);
        System.out.print(" anos, e estou aprendendo a programar.");

    }
}
