package luizacode.exercicios2;


import java.util.Scanner;

public class AppAgenda  {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner (System.in);
		
		int menu;
		Agenda agenda = new Agenda();
		Pessoa objPessoa;
		String nome;
		int idade;
		double altura;
		int index;
		
		
							
		do {
			exibirMenu();
			menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("Incluir Contato");
					System.out.println("Digite o nome: ");
					nome = scanString.nextLine();
					System.out.println("Digite a idade: ");
					idade = scan.nextInt();
					System.out.println("Digite a altura: ");
					altura = scan.nextDouble();
								
					objPessoa = new Pessoa(nome, idade, altura);
					
					agenda.armazenaPessoa(objPessoa);
					
					
					break;		
					
				case 2:
					System.out.println("Remover Contato");
					System.out.println("Digite o nome: ");
					nome = scanString.nextLine();
						agenda.removePessoa(nome);
						
					break;
				
				case 3:
					System.out.println("Buscar Contato");
					System.out.println("Digite o nome: ");
					nome = scanString.nextLine();
						agenda.buscaPessoa(nome);

					break;
				
				case 4:
					System.out.println("Imprimir Agenda");
					System.out.println(agenda.imprimeAgenda());
														
					break;
				
				case 5:
					System.out.println("Imprimir Contato");
					System.out.println("Digite o número do contato: ");
					index = scan.nextInt();
						agenda.imprimePessoa(index);
					break;
					
				default:
					System.out.println("Opção de menu inválida");
			}
			
		}while (menu !=7);
		

	}

	private static void exibirMenu() {
		System.out.println("--------Agenda--------");
		System.out.println("1 - Armazena Pessoa");
		System.out.println("2 - Remove Pessoa");
		System.out.println("3 - Busca Pessoa");
		System.out.println("4 - Imprime Agenda");
		System.out.println("5 - Imprime Pessoa");
		
			
	}

}
