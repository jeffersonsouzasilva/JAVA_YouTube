/*
IMPRIMIR TEXTOS E NÚMEROS (j0010)

Faça um programa que imprima a frase:
"Seja bem-vindo ao meu programa!"
Em seguida, imprima uma linha em branco e na sequência, imprima as frases e o
resultado da expressões matemáticas.

Cada frase e seu resultado devem estar na mesma linha.
    "O produto de 8 por 90 é igual a : "
    "O quociente de 90 por 30 é igual a: "
    "O quadrado de 9 é:"

Nota(s):
1)  Em cada expressão matemática, você deve imprimir o resultado de uma expressão na
    qual o compilador é quem resolver. Ou seja, é para concatenar a frase sugerida no
    enunciado com o resultado.
 */

public class ex02 {
    public static void main(String[] args) {
        // imprimir a frase: "Seja bem-vindo ao meu programa!"
        System.out.println("Seja bem-vindo ao meu programa!");

        // calcular o produto de 8 por 90
        System.out.print("O produto de 8 por 90 é igual a : ");
        System.out.println(8*90);

        // calcular o quociente 90 por 30
        System.out.println("O quociente de 90 por 30 é igual a: " + 90/30);

        // calcular o quadrado de 9
        System.out.print("O quadrado de 9 é: ");
        System.out.print(9*9);
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("4 quebra de linhas");
    }
}
