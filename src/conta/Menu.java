package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;

public class Menu 
{
	
	public static void main(String[] args) 
	{
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		//Informações para o Usuário
		System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO);
		System.out.println("________________________________________\n");
		System.out.println("               GenWarrior");
		System.out.println("________________________________________\n");
		System.out.println("     1 - Criar Conta");
		System.out.println("     2 - Listar todas as Contas");
		System.out.println("     3 - Buscar Conta por Numero");
		System.out.println("     4 - Atualizar Dados da Conta");
		System.out.println("     5 - Apagar Conta");
		System.out.println("     6 - Sacar");
		System.out.println("     7 - Depositar");
		System.out.println("     8 - Transferir valores entre Contas");
		System.out.println("     9 - Sair");
		System.out.println("________________________________________\n" + Cores.RESETAR_CORES);
	
		while (true) 
		{
			System.out.print(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Entre com a opção desejada: ");
			try 
			{
				opcao = ler.nextInt();
			}catch(InputMismatchException erroString) 
			{
				System.out.println("Digite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}

			switch (opcao) 
			{
			case 1:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Criar Conta");
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Listar todas as Contas");

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Consultar dados da Conta - por número");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Atualizar dados da Conta");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Apagar a Conta");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Saque");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Depósito");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Transferência entre Contas");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXTO_VERMELHO_NEGRITO_INTENSO + "\nOpção Inválida!");
				
				keyPress();
				break;
			}
			
			if (opcao == 9) 
			{
				System.out.println(Cores.TEXTO_BRANCO_NEGRITO_INTENSO + "Banco do Brazil com Z - O seu Futuro começa aqui!");
				ler.close();
				System.exit(0);
			}
			
		}

	}
	public static void keyPress()
	{
		try 
		{
			System.out.println(Cores.RESETAR_CORES+ "Pressione enter para continuar...");
			System.in.read();
		}catch (IOException erroEntradaSaida) 
		{
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
