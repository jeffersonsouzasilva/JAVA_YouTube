/*
SOMA DE TODOS OS NÚMEROS EM UM INTERVALO (j1003)

Faça um programa que mostre a soma de todos os números no intervalo determinado pelo
usuário. Logo, peça para que o usuário defina o início da contagem e em seguida, peça ao
mesmo que informe o final.
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        //Criamos uma nova instancia da classed Scanner
        Scanner in = new Scanner(System.in);
        //Imprimimos a frase pedindo o inicio do intervalo
        System.out.println("Informe o início do intervalo: ");
        //Capturamos o inicio do intervalo
        int ini = in.nextInt();
        //Imprimimos a frase pedindo o término do intervalo
        System.out.println("Informe o final do intervalo: ");
        //Capturamos o término do intervalor
        int fim = in.nextInt();

        int i = ini;
        int soma = ini;
        while (i<fim){
            i++;
            soma+=i; // soma = soma + i;
        }
        System.out.println(soma);

        /*
        Para entender o raciocinio do problema:
            i    = 1
            ini  = 1
            soma = 1
            fim  = 5
            1..5 = [4]
            ---------------- -------- ------------- -------------- -------
            | variável......|    i   |     soma    | soma + i     | fim    |
            | valor incial..|   1    |       1     |   1  + 1     |  5     |
            | expressão.....| i=i+1  | soma=soma+1 |              |        |
            | ------------- | ------ | ----------- | ------------ | ------ |
            |1 ciclo(i<5)...|  i=1   | soma=1      |  1  + 2 = 3  |     5  |
            |2 ciclo(i<5)...|  i=2   | soma=3      |  3  + 3 = 6  |     5  |
            |3 ciclo(i<5)...|  i=3   | soma=6      |  6  + 4 = 10 |     5  |
            |4 ciclo(i<5)...|  i=5   | soma=10     |  10 + 5 = 15 |     5  |
             --------------- -------- ------------- -------------- --------

         */
    }
}
