/*
SIMPLIFOCAÇÃO (j0110)

Reescreva o código a seguir a fim de se utilizar o mínimo de linha possíveis:

Nota(s):
    - Amontoar linhas não soluciona o problema. O código a seguir não é simplificação e sim,
      confusão:
      int x = 0; x = System.out.println(“Digite um número”);

    - Escreva de forma tal a utilizar somente 4 linhas

Código Fonte:
    Scanner in = new Scanner(System.in);
    System.out.println("Simplificando expressões para reduzir o número de linhas");
    int x = 0;
    x = in.nextInt();
    if(x > 10){
        System.out.println("O número digitado é maior do que 10");
    }else{
        System.out.println("O número digitado é menor do que 10");
    }
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        System.out.println("Simplificando expressões para reduzir o número de linhas");
//        int x = new Scanner(System.in).nextInt();
//        String s = (new Scanner(System.in).nextInt() > 10) ? "maior" : "menor"; //Se x for maior que 10(x > 10) então(?) imprima "maior", senão(:) imprima "menor"
        System.out.println("O número digitado é "+
                ((new Scanner(System.in).nextInt() > 10) ? "maior" : "menor") +
                    " do que 10");


    }
}
