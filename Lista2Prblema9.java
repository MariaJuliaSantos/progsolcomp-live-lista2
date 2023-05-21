// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema9
// Data: 21/05/23

import java.util.Scanner;

class Lista2Prblema9{
		public static void main(String[] args) {
		double valorvenda;
		int pagamento;

	  Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da venda: ");
		valorvenda = teclado.nextInt();
		System.out.println(" ");
		System.out.println("[1] a Vista ");
		System.out.println("[2] a Prazo 30 dias ");
		System.out.println("[3] a Prazo 60 dias ");
		System.out.println("[4] a Prazo 90 dias ");
		System.out.println("[5] cartão de débito ");
		System.out.println("[6] cartão de crédito ");
		System.out.println(" ");
		System.out.println("Digite o número acima que indique a forma de pagamento: ");
		
		pagamento = teclado.nextInt();

    teclado.close();

		 switch (pagamento) {
				    case 1:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda -(valorvenda*0.1));
						break;
						case 2:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda -(valorvenda*0.05));
						break;
						case 3:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda );
						break;
						case 4:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda +(valorvenda*0.05));
						break;
						case 5:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda -(valorvenda*0.08));
						break;
						case 6:
				    System.out.println("Valor total da venda:");
						System.out.println( valorvenda -(valorvenda*0.07));
						break;
		 }
		}
	 }