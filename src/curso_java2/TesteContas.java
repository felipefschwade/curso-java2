package curso_java2;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(1000);
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.printf("O saldo �: %.2f", cc.getSaldo());
		System.out.printf("O saldo �: %.2f", cp.getSaldo());

	}
}
