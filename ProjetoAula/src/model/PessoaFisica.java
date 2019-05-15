package model;

import java.awt.Toolkit;

public class PessoaFisica {
	
	private String nome, endereco, bairro, cep, cidade, telefone, celular, rg, cpf;
	Toolkit estado;
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEndereco(String e) {
		this.endereco = e;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setBairro(String b) {
		this.bairro = b;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setCep(String c) {
		this.endereco = c;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCidade(String c) {
		this.cidade = c;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setEstado(Toolkit e) {
		this.estado = e;
	}
	
	public Toolkit getEstado() {
		return this.estado;
	}
	
	public void setTelefone(String t) {
		this.telefone = t;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCelular(String c) {
		this.celular = c;
	}
	
	public String getCelular() {
		return this.celular;
	}
	
	public void setRg(String r) {
		this.rg = r;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public void setCPF(String c) {
		this.cpf = c;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
}

