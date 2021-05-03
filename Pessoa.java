package luizacode.exercicios2;

//import java.text.SimpleDateFormat;

public class Pessoa {
	
	public static String nome;
	public static String dataNascimento;
	public static double altura;
	public static int idade;

	
	
	//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa() {};
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String imprimir() {
			return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
	}


	



	
	

}
	
