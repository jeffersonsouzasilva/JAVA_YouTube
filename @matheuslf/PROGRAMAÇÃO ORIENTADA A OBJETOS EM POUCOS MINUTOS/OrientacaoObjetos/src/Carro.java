public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private  double velocidade;
    private Volante volante;
    private Pedais pedais;

    public Carro(){}

    public Carro(String marca, String modelo, int ano, double velocidade, Volante volante, Pedais pedais) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.volante = volante;
        this.pedais = pedais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    public void acelerar(double incremento){
        velocidade = velocidade + incremento;
    }

    public void frear(double decremento){
        velocidade = velocidade - decremento;
        if (velocidade < 0){
            velocidade = 0;
        }
    }

    public void exibirInformaoes(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo" + getModelo());
        System.out.println("Ano" + getAno());
        System.out.println("Velocidade" + getVelocidade());
    }
}
