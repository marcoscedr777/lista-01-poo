package aula04;

public class Aula04 {

	public static void main(String[] args) {
		
		Ave ave1 = new Ave();
		ave1.especie="papagaio";
		ave1.nome="Blond Joseph";
		ave1.cor="verde";
		ave1.tamanho=0.33;
		ave1.peso=0.24;
		
		Ave ave2 = new Ave();
		ave2.especie="pato";
		ave2.nome="Patolino";
		ave2.cor="preto";
		ave2.tamanho=0.75;
		ave2.peso=1.5;
		
		Automovel auto1 = new Automovel();
		auto1.marca="Chevrolet";
		auto1.modelo="Celta";
		auto1.cilindradaDoMotor=1500;
		auto1.totalDeRodas=4;
		auto1.tamanhoTanque=75;
		
		Automovel auto2 = new Automovel();
		auto2.marca="Fiat";
		auto2.modelo="Gol";
		auto2.cilindradaDoMotor=500;
		auto2.totalDeRodas=4;
		auto2.tamanhoTanque=60;
		
		Pesso p1 = new Pesso();
		p1.nome="Marcelo";
		p1.idade=29;
		p1.sexo="masculino";
		p1.nacionalidade="brasileiro";
		p1.naturalidade="Cedro";
		p1.estadoCivil="solteiro";
		
		Pesso p2 = new Pesso();
		p2.nome="Bruno";
		p2.idade=60;
		p2.sexo="masculino";
		p2.nacionalidade="argentino";
		p2.naturalidade="Buenos Aires";
		p2.estadoCivil="solteiro";
		
		Contatos c1 = new Contatos();
		c1.nome="Joaozinho bala tensa";
		c1.telefone="8840028922";
		c1.endereco="Rua Pavimentada 777";
		
		Contatos c2 = new Contatos();
		c2.nome="Marcos";
		c2.telefone="8812345678";
		c2.endereco="Rua Deserta 342";
		
		ave1.voar();
		ave2.cacar();
		
		auto1.acelerar();
		auto2.parar();
		
		p1.casar();
		p2.estudar();
		
		c1.ligarParaContato();
		c2.salvarContato();
	}

}
