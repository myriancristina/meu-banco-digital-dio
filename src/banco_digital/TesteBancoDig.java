package banco_digital;

public class TesteBancoDig {

	public static void main(String[] args) {
		Cliente myrian = new Cliente();
		myrian.setNome("Myrian Cristina Silva");
		
		Conta cc = new ContaCorrente(myrian);
		cc.depositar(900);
		
		Conta poupanca = new ContaPoupanca(myrian);
		cc.transferir(600, poupanca);
	    poupanca.sacar(200);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}