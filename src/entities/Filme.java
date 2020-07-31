package entities;

import java.util.ArrayList;
import java.util.List;

public class Filme {

	private Integer codFilme;
	private String titulo;
	private String sinopse;
	private Integer duracao;
	
	private List<Item> itens = new ArrayList<>();
	private List<Ator> atores = new ArrayList<>();
	
	
	public Filme() {
		
	}
    

	public Filme(Integer codFilme, String titulo, String sinopse, Integer duracao) {
		super();
		this.codFilme = codFilme;
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.duracao = duracao;
	}


	public Integer getCodFilme() {
		return codFilme;
	}


	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}


	public Integer getDuracao() {
		return duracao;
	}


	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}


	public List<Item> getItens() {
		return itens;
	}


	public void setItens(List<Item> itens) {
		this.itens = itens;
	}


	public List<Ator> getAtores() {
		return atores;
	}


	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}


	@Override
	public String toString() {
		return "Filme [codFilme=" + codFilme + ", titulo=" + titulo + ", sinopse=" + sinopse + ", duracao=" + duracao
				+ ", itens=" + itens + ", atores=" + atores + "]";
	}
	
	
	
	
}
