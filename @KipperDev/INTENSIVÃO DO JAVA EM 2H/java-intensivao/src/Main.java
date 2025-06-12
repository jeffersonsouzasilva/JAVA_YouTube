/*
Até o minuto 22:44 do vídeo

public class Main {

    interface FactorialNumber {
        boolean test(int a, int b);
    }
    public static void main(String[] args){
        FactorialNumber isFactor = (a, b) -> (b % a) == 0;

        forEach (element -> element *2);

        if (isFactor.test(9, 5)) {
            System.out.println("5 is a factor of 9");
        } else {
            System.out.println("5 is not a factor of 9");
        }
    }
}

*/

/*
    public static int soma(String fruta){
        return 5;
    }


    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");

        // Usando referência de método para imprimir cada fruta

        frutas.stream().forEach(item -> soma(item));




    }
*/


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFutureExample completableFutureExample = new CompletableFutureExample();

        CompletableFuture completableFuture = CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
            pokemonAbilityFetch.fetch();
        });
        System.out.println("Main thread is blocked");
        try {
            completableFuture.get();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}