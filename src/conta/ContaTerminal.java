package conta;
import java. util. Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		int numero_conta;
		String agencia;
		String nome_cliente;
		float saldo;
		
		Scanner entradaPeloTeclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta.");
		numero_conta = entradaPeloTeclado.nextInt();
		System.out.println("Digite o n�mero da Ag�ncia.");
		agencia = entradaPeloTeclado.next();
		System.out.println("Digite o nome do cliente.");
		nome_cliente = entradaPeloTeclado.next();
		System.out.println("Digite o saldo da conta.");
		saldo = entradaPeloTeclado.nextFloat();
		
		System.out.println("Ol� "+ nome_cliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia +", conta " + numero_conta + " e seu saldo " + saldo + " j� est� dispon�vel para saque.");
		
		entradaPeloTeclado.close();

	}

}
