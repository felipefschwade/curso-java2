package curso_java2;

public class TesteContas {
	public static void main(String[] args) throws Exception {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		try {
			cc.deposita(-1000);
		} catch (Exception e) {
			System.out.println("Não é possível depostiar um valor negativo");
		}
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.printf("O saldo é: %.2f", cc.getSaldo());
		System.out.printf("O saldo é: %.2f", cp.getSaldo());

	}
}
