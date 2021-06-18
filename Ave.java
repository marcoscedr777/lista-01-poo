package aula04;

public class Ave {
	
	String especie;
	String nome;
	String cor;
	double tamanho;
	double peso;
	
	void voar() {
		System.out.printf(nome);
		System.out.println(": estou voando");
	}
	
	void pousar() {
		System.out.println("pousei");
	}

	void cacar() {
		System.out.printf(nome);
		System.out.println(": eu nao sei cacar :/");
	}
	
}
