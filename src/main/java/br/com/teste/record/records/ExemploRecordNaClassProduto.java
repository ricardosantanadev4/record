package br.com.teste.record.records;

import java.util.Objects;

/* essa classe foi criada como se fosse uma record para exibir o que tem em uma record e fins de conhecimento, 
 * tudo que tem nessa classe tem na record o que nao foi adicionando nao tem na record 
 * em uma classe agente tem que criar os metodos getts e, construtores de atributos, hashCode() and equals(), na record nao precisamos
 * que da em torno de  50 linhas de codigo, na record nao prexisamos criar essas 50 linhas de codigo, ja existe por tras dos panos */
public class ExemploRecordNaClassProduto {

	private final Long id;
	private final String nome;
	private final String desc;

	/*
	 * na classe agente pode reatribuir um novo valor ao atributo porque nao e uma
	 * constante final na record todos os atributos por padrao sao constantes final
	 * e nao conseguinmos reatribuir um no valor
	 */
//	/* ex:
//	 * private String exemplo = "";
//	 * public void exemplo() { 
//   * this.exemplo = "exemplo";
//	 * }
//	 */

	/*
	 * como todos os atributos da record sao do tipo final as records nao tem
	 * construtor vazio nem o metodos setters o tipo final nao permite nenhum
	 * modificador
	 */

//	nas records os metodos get utilizao somente o nome do atributo no lugar de getId e somente Id
	public Long Id() {
		return id;
	}

	public String Nome() {
		return nome;
	}

	public String Desc() {
		return desc;
	}

	public ExemploRecordNaClassProduto(Long id, String nome, String desc) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desc, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExemploRecordNaClassProduto other = (ExemploRecordNaClassProduto) obj;
		return Objects.equals(desc, other.desc) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "ClassProduto [id=" + id + ", nome=" + nome + ", desc=" + desc + "]";
	}
}