/*
TABUADA AO AVESSO (j0111)

Escreva um programa que peça para o usuário informar qual tabuada o mesmo deseja ver e
armazene o número em uma variável. Em seguida, imprima a tabuada na tela se utilizando da
instrução FOR. Para imprimir a tabuada, siga o modelo abaixo:

    Por favor, informe qual a tabuada que você deseja:
    Ax X B10 = C resultado 10
    Ax X B9 = C resultado 9
    Ax X B8 = C resultado 8

    Nota(s):
        Ax, B e C representam, respectivamente:
        Ax -> número da tabuada desejada pelo usuário
        B -> número a ser incrementado
        C -> resultado da expressão Ax X Bx = Cx

    Exemplo:
        5 x 10 = 50
        5 x 9   = 45
        5 x 8   = 40

 */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        //Pedimos para o usuário informar a tabuada
        System.out.println("Digite a tabuada que você deseja: ");
        //Criamos uma instância da classe Scanner
        Scanner in = new Scanner(System.in);
        //Pegamos o valor digitado pelo usuário
        int tabuada = in.nextInt();

        for (int i = 10; i >= 1; i--){
            //Ax X Bx = Cx
            //Ax -> valor informado pelo usuário
            //Bx -> valor a ser decrementado
            //Cx -> cálculo
            System.out.println(tabuada +
                                    " x " +
                                    i +
                                    " = " +
                                    (tabuada*i));
            // Ax X Bx = Cx
        }
    }
}
