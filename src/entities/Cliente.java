package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
	
	private Integer codCliente;
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private Date dataNascimento;
	
	private List<Item> itens = new ArrayList<Item>();
	
	public Cliente() {
		
	}

	public Cliente(Integer codCliente, String nome, String cpf, String email, String endereco, Date dataNascimento) {
		super();
		this.codCliente = codCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", itens=" + itens + "]";
	}
	
		
}
