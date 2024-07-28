public class Main {
    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");


        Conta cc = new ContaCorrente(anderson);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(anderson);
        poupanca.depositar(200.67);

        cc.transferir(50.78, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato(); 
    }
}
