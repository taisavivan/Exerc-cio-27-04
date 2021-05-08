package luizacode.exercicios2;

import java.util.ArrayList;
//import java.util.List;

public class Agenda extends Pessoa {
	
		private ArrayList<Pessoa> contatos = new ArrayList<>(10);
		
				
		
		public void armazenaPessoa(Pessoa pessoa) {
			if (contatos.size() < 10)	{
				contatos.add(pessoa);
			} else {
				System.out.println("Não há espaço na agenda. Remova um contato.");
			}
				}

		
		public void removePessoa(String nome) {
			for(Pessoa pessoa : contatos) {
				if(pessoa.getNome().equalsIgnoreCase(nome)) {
					contatos.remove(pessoa);
									
				}
			}
		}

		
		public Pessoa buscaPessoa(String nome) {
			for(Pessoa pessoa : contatos) {
				if(pessoa.getNome().equalsIgnoreCase(nome)) {
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Idade: " + pessoa.getIdade());
					System.out.println("Altura: " + pessoa.getAltura());
					return pessoa;
				}
			}
			return null;
		}

		
		public String imprimeAgenda() {
			String saida = "";
			int i = 1;
			for(Pessoa pessoa : contatos) {
				saida += "Contato nº " + (i++) + "\n";
				saida += pessoa.imprimir() + "\n";
			}
			
			return saida;
		
			
		}

		
		public void imprimePessoa(int index) {
			int i = 0;
			for(int j = 0; j < contatos.size(); j++) {
				Pessoa pessoa = contatos.get(j);
				if(j == index) {
					System.out.println("Contato: " + i);
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Idade: " + pessoa.getIdade());
					System.out.println("Altura: " + pessoa.getAltura());
					return;
				}
			}
			return;
			
		}
		

}
