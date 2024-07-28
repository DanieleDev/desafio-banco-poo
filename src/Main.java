public class Main {

    public static void main(String[] args) {
		Cliente clienteUm = new Cliente();
		clienteUm.setNome("Daniele");

		Conta cc = new ContaCorrente(clienteUm);
		Conta poupanca = new ContaPoupanca(clienteUm);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(120);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}