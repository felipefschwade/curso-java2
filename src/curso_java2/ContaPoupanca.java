package curso_java2;

public class ContaPoupanca extends Conta {
	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa * 3);
	}

	public void deposita(double valor) {
		if (valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar um valor negativo");
        } else {
            this.saldo += valor  - 0.10;        
        }        
	}
}
