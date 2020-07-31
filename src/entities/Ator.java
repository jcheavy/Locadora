package entities;

import java.util.ArrayList;
import java.util.List;

public class Ator {
	
	private Integer codAtor;
	private String nome;
	private String nacionalidade;
	
	private List<Filme> filmes = new ArrayList<Filme>();
	
	public Ator() {
		
	}

	public Ator(Integer codAtor, String nome, String nacionalidade) {
		super();
		this.codAtor = codAtor;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public Integer getCodAtor() {
		return codAtor;
	}

	public void setCodAtor(Integer codAtor) {
		this.codAtor = codAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	@Override
	public String toString() {
		return "Ator [codAtor=" + codAtor + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", filmes=" + filmes
				+ "]";
	}
	
	
	

}
