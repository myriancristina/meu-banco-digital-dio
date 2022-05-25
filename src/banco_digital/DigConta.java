package banco_digital;

public interface DigConta {
	
     void sacar(double valor);
	
	 void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato();
}