package aula04;

public class Contatos {

	String nome="Joaozinho bala tensa";
	String telefone="8840028922";
	String endereco="Rua Pavimentada 777";
	
	void salvarContato() {
		System.out.println("*Contato salvo*");
		System.out.println(nome);
	}
	
	void ligarParaContato() {
		System.out.println("*Ligando para*");
		System.out.println(nome);
	}
	
	void mostrarContato() {
		System.out.println(nome);
		System.out.println(telefone);
	}
}
