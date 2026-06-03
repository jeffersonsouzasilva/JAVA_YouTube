public class Volante {
    private String tipo;
    private boolean possuiControles;

    public Volante(String tipo, boolean possuiControles) {
        this.tipo = tipo;
        this.possuiControles = possuiControles;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPossuiControles() {
        return possuiControles;
    }

    public void setPossuiControles(boolean possuiControles) {
        this.possuiControles = possuiControles;
    }
}
