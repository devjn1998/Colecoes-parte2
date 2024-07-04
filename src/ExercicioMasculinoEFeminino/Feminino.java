package ExercicioMasculinoEFeminino;

import java.util.Objects;

public class Feminino implements Comparable<Feminino>{
	
	private String nome;
	private Integer idade;

	public Feminino(String nome, Integer idade) {
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
		return "Feminino [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Feminino feminino) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(feminino.getNome());
	}

}

