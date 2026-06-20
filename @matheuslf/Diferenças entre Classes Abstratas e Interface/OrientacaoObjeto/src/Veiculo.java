public abstract class Veiculo {

    protected String modelo;
    protected int velocidade;

    public Veiculo(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        velocidade += 10;
        System.out.println("Veículo acelerado! Velocidade: "
                + velocidade);
    }

}
