public interface Eletrico {
    void carregarBateria();

    default void statusBateria() {
        System.out.println("Verificando bateria ...");
    }
}
