public class CarroEletrico extends Carro{

    private Bateria bateria;

    public CarroEletrico(String marca, String modelo, int ano, double velocidade, Volante volante, Pedais pedais, Bateria bateria) {
        super(marca, modelo, ano, velocidade, volante, pedais);
        this.bateria = bateria;
    }

    @Override
    public void acelerar(double incremento) {
        //bateria.consumir(2);
        super.acelerar(incremento);
    }
}
