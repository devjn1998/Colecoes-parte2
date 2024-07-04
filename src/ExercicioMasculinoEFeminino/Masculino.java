package ExercicioMasculinoEFeminino;

import java.util.Objects;

public class Masculino implements Comparable<Masculino>{
	
	private String nome;
	private Integer idade;

	public Masculino(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Masculino [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Masculino masculino) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(masculino.getNome());
	}

}
