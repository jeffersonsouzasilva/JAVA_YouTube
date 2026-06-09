public class Bateria {
    private int capacidade;
    private int nivelCarga;

    public Bateria(int capacidade, int nivelCarga) {
        this.capacidade = capacidade;
        this.nivelCarga = nivelCarga;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }
}
