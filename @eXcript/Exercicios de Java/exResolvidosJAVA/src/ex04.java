/*
DIFERENÇA DE IDADE (j0100)

Escreva um pequeno software que peça a sua idade e a idade da sua mãe. Em seguida,
imprima na tela as 3 informações a seguir:

    1) a sua idade
    2) a idade da sua mãe
    3) minha mãe é <anos> mais velha do que eu

Nota(s):
    1) substitua o texto <anos> pela diferença entre a sua idade e a de sua mãe.
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //é obter a idade do nosso usuário
        System.out.println("Digite sua idade: ");
        int idadeUsu = in.nextInt();
        //é obter a idade da mãe do nosso usuário
        System.out.println("Informe a idade da sua mãe: ");
        int idadeMae = in.nextInt();

        //subtrair a idade da mãe pela idade do usuário
        int diff = idadeMae - idadeUsu;

        //é imprimir o texto e substituir a tag <anos>
        System.out.printf("minha mãe é %d mais velha do que eu!", diff); // .printf imprimir formatado, a variavel diff esta sendo substuida por %d

    }
}
