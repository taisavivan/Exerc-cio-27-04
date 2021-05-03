package luizacode.exercicios2;

import java.util.ArrayList;
//import java.util.List;

public class Agenda extends Pessoa {
	
		private static ArrayList<Pessoa> contatos = new ArrayList<>(10);
		
				
		
		public void armazenaPessoa(Pessoa pessoa) {
			if (contatos.size() < 10)	{
				contatos.add(pessoa);
			} else {
				System.out.println("Não há espaço na agenda. Remova um contato.");
			}
			
		}

		
		public static void removePessoa(String nome) {
			for(Pessoa pessoa : contatos) {
				if(pessoa.getNome().equalsIgnoreCase(nome)) {
					contatos.remove(pessoa);
									
				}
			}
		

			
		}

		
		public Pessoa buscaPessoa(String nome) {
			for(Pessoa pessoa : contatos) {
				if(pessoa.getNome().equalsIgnoreCase(nome)) {
					return pessoa;
				}
			}
			return null;
		}

		
		public static String imprimeAgenda() {
			String saida = "";
			int i = 1;
			for(Pessoa pessoa : contatos) {
				saida += "Contato nº " + (i++) + "\n";
				saida += pessoa.imprimir() + "\n";
			}
			
			return saida;
		
			
		}

		
		public void imprimePessoa(int index) {
			int i = 1;
			for(Pessoa pessoa : contatos) {
				if(i == index) {
					System.out.println("Contato: " + index);
					System.out.println("Nome: " + getNome());
					System.out.println("Idade: " + getIdade());
					System.out.println("Altura: " + getAltura());
					return;
				}
			}
			return;
			
		}
		

}
