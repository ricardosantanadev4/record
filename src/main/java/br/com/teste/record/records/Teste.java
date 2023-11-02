package br.com.teste.record.records;

public class Teste {

	public static void main(String[] args) {

		recordsExemplo();
	}

//	como o metodo e static ele mode ser chamado em outro metodo ou outra classe
	public static void recordsExemplo() {

//		instaciando a record em outra classe
		RecordProduto produto = new RecordProduto(1L, "Café", "Café fresquinho");

		System.out.println(produto);

//		agente tambem pode criar uma recod dentro de uma classe ex
		record Temporaria(String nome) {
		}

//		posso instanciar a record criada
		Temporaria temp = new Temporaria("nome");

		System.out.println(temp.nome());
	}

}