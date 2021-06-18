package aula04;

public class Automovel {

	String marca="Chevrolet";
	String modelo="Celta";
	double cilindradaDoMotor=1500;
	int totalDeRodas=4;
	double tamanhoTanque=75;
	
	void acelerar() {
		System.out.printf(modelo);
		System.out.println(": vruuuuuuuuuuum");
	}
	
	void abastecer() {
		System.out.println("enchendo o tanque");
	}
	
	void parar() {
		System.out.printf(modelo);
		System.out.println(": parei");
	}
	
	void estacionar() {
		System.out.println("estacionado");
	}
}
