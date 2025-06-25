// comando psvm = public static void main(String[] args)
// comando sout = System.out.println();

public class Main {
    public static void main(String[] args) {
/*      //numeros inteiros = 100, 234345, 255, 120, 1,9193939393939394
        byte => 8 bits => -128 a 127
        short => 16 bits => -13.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.483.647
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // numeros decimais = 1.2, 3.4, 5.6, 7.8, 9.0
        // 5.50
        float => 32 bits => precisão simples
        double => 64 bits => precisão dupla

        String => representar palavras e frases
        char => representar um unico caractere => a,b,c,d
        char meuChar = 'a';
        meuChar = "Fernanda";

        boolean => true ou false
        */

        byte b = 100;
        short s = 10000;
        int i = 5;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Fernanda";
        boolean bool = false;

        int[] colecaoDeInteiros= {1, 2, 3, 4, 5, 3333};
        int[] meusNumeros = new int[4];

//        System.out.println("byte: " + b);
        if (str.isBlank()){ // usar (str.isBlank()){  / (str.equals("Fernanda")){
            System.out.println("Verdadeiro");
        } else if (str == "Fernanda") {
            System.out.println("Fernanda");
        } else {
            System.out.println("Falso");
        }

        System.out.println(colecaoDeInteiros[5]);
    }
}// Declarar uma variavel

