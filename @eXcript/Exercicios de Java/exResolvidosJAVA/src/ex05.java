/*
LOGIN E SENHA (j0101)

Desenvolva um pequeno programa de login e senha. Para isso, peça ao usuário para digitar o
seu login e armazene o que o usuário digitou em uma variável. Em seguida, peça para o
usuário digitar a sua senha e armazena em uma outra variável. Por fim, verifique se o login e
a senha são iguais àquele definido por você.

Dica(s):
    1) Você pode utilizar para login o seu nome e para a senha o seu CPF
 */


import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Informe o seu login
        System.out.println("Login> ");
        String login = in.nextLine();

        //Informe a sua senha
        //Armazenar em variaveis o login e a senha
        System.out.println("senha> ");
        String senha = in.nextLine();

        //Verificar se o login e a senha estão corretos
        if (login.equals("claudio") && senha.equals("123456789-09")){  // é equivalente a (login=="claudio" && senha=="123456789-09"), porém estamos comparando uma istancia(objeto) com uma string
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else {
            System.out.println("Login ou senha inválidos!");
        }

    }
}
