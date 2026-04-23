public class Acougueiro extends Funcionario{
    public Acougueiro(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public void exibirDados() {
        System.out.println("Dados do Açougueiro: ");
        super.exibirDados();
    }
}
