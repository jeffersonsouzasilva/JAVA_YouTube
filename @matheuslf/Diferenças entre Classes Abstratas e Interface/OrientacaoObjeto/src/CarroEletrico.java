public class CarroEletrico extends Veiculo implements Eletrico {
    private int bateria = 100;

    public CarroEletrico(String modelo) {
        super(modelo, 0);
    }

    @Override
    public void frear() {
        velocidade -= 8;
    }
}
