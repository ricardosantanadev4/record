package br.com.teste.record.records;

// nesse ex temos a classe RecordProduto que extends a classe Record
// os atributos da record sao declardos dentro dos () que funciona como um construtor
public record RecordProduto(Long id, String nome, String desc) {

//	a record nao permite declarar um atributo dentro das {} somente nos () 
//	String exemplo1 = ""; // erro Campos não estáticos declarados pelo usuário exemplo1 não são permitidos em uma record

//	todos os atributos da record por padrao sao do tipo final e nao permite reatribuir um novo valor
	public void exemplo() {
//		this.nome = "exemplo"; // erro The final field RecordProduto.nome cannot be assigned
	}

//	agente pode declar atributos estaticos
	public static int contador = 0;

//	pode criar metodos
	public void meuMetodo() {

	}

}