public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Fusca");
        c.acelerar();
        c.frear();

        CarroEletrico tesla = new CarroEletrico("Tesla");
        tesla.acelerar();
        tesla.frear();
        tesla.carregarBateria();
        tesla.statusBateria();
        
    }
}
