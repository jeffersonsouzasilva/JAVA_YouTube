public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo, 0);
    }

    @Override
    public void frear() {
        velocidade -= 5;
        System.out.println("Freando carro...");
    }
}
