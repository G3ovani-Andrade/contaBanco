package contaBanco;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, Digite o número da agência:");
		var numeroAgengia = scanner.next();
		
		System.out.println("Por favor, Digite o número da conta: ");
		var numeroConta = scanner.nextInt();
		
		System.out.println("Por favor, Digite seu nome: ");
		var nomeCliente = scanner.next();
		
		System.out.println("Por favor, Digite o saldo inicial: ");
		var saldo = scanner.nextDouble();
		
		var mesagem = MessageFormat.format(
				"Olá cliente {0}, obrigado por criar uma conta em nosso banco, sua agência é {1},"
				+ "conta {2} e seu saldo R${3} ja esta disponível para saque",
				nomeCliente,numeroAgengia,numeroConta,saldo);
		
		System.out.println(mesagem);
	}

}
