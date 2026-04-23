/*
 - Para gerar Getter & Setter, clickar com direito, opção generate e escolher getter e setter
 - Para emitir toString digite to e escolha a opção valores generate
*/
public class Produto {
    //Atributos
    private String nome;
    private double precoPorKg;

    //construtor
    public Produto(String nome, double precoPorKg){
        this.nome = nome;
        this.precoPorKg = precoPorKg;
    }

    public Produto() {
        nome = "";
        precoPorKg = 0;
    }

    //metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoPorKg() {
        return precoPorKg;
    }

    public void setPrecoPorKg(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoPorKg=" + precoPorKg +
                '}';
    }

    //metodo especifico da classe
    public double calcularPreco(double quantidadeKg){
        return precoPorKg * quantidadeKg;
    }
}