public class CarroGasolina extends Carro{
    private double nivelCombustivel;

    @Override
    public void acelerar(double incremento) {
        setVelocidade(getVelocidade() + incremento);
        nivelCombustivel -= 0.5;
        super.acelerar(incremento);
    }
}
