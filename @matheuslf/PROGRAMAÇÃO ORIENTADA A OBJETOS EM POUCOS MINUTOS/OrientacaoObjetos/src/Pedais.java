public class Pedais {
    private int quantidade;
    private boolean esportivo;


    public Pedais(int quantidade, boolean esportivo) {
        this.quantidade = quantidade;
        this.esportivo = esportivo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isEsportivo() {
        return esportivo;
    }

    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }
}
