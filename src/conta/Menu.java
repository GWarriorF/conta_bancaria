package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) 
	{
		//Teste Conta
		Conta conta1 = new Conta("Gabriela Guerra", 1, 123, 2, 50000.00f);
		conta1.print();
		conta1.sacar(10000.00f);
		conta1.print();
		conta1.depositar(20000.00f);
		conta1.print(); 
		
		//Teste conta Poupança
		ContaPoupanca conta2 = new ContaPoupanca("Igor Augusto", 1, 001, 2, 20000.00f, 15);
		conta2.print();
		conta2.sacar(10000.00f);
		conta2.print();
		conta2.depositar(20000.00f);
		conta2.print(); 
		
		//Teste conta Corrente
		ContaCorrente conta3 = new ContaCorrente("Magda Guerra", 1, 001, 2, 30000.0f, 100000.0f);
		conta3.print();
		conta3.sacar(50000.00f);
		conta3.print();
		conta3.depositar(200000.00f);
		conta3.print();
		
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		//Informações para o Usuário
		System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + Cores.PRETO_PLANO_DE_FUNDO);
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                BANCO DO BRAZIL COM Z                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Conta                          ");
		System.out.println("            2 - Listar todas as Contas               ");
		System.out.println("            3 - Buscar Conta por Numero              ");
		System.out.println("            4 - Atualizar Dados da Conta             ");
		System.out.println("            5 - Apagar Conta                         ");
		System.out.println("            6 - Sacar                                ");
		System.out.println("            7 - Depositar                            ");
		System.out.println("            8 - Transferir valores entre Contas      ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************" + Cores.RESETAR_CORES);
	
		while (true) 
		{
			System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Entre com a opção desejada:                          ");
			System.out.println("                                                     " );

			opcao = ler.nextInt();

			switch (opcao) 
			{
			case 1:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXTO_VERMELHO_NEGRITO_INTENSO + "\nOpção Inválida!\n");
				break;
			}
			
			if (opcao == 9) 
			{
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				ler.close();
				System.exit(0);
			}
			
		}

	}

}
