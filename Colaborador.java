package model;

public class Colaborador {

	private int ID;
	private String nome_colaborador;
	private String cpf;
	private String cnh;
	
	public Colaborador (String nome_colaborador, String cpf) {
		this.nome_colaborador = nome_colaborador;
		this.cpf = cpf;
	}
	public Colaborador() {
}
	public int getID() {
		return ID;
	}
	public String getNome() {
		return nome_colaborador;
	}
	public void setNome(String nome) {
		this.nome_colaborador = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getcnh() {
		return cnh;
	}
	public void setCNH(String cnh) {
		this.cnh = cnh;
	}
	
	public String toString(){
		return nome_colaborador + " Permissão CNH: " + cnh;
	}
}
