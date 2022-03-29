package model;

import java.util.List;

public class Chamados {

	private int ID_chamados;
	private Veiculo veiculo;
	private Veiculo km_inicial;
	private Veiculo km_final;
	private List<Colaborador> colaborador;
	
	public int getID_chamados() {
		return ID_chamados;
	}

	public void setID_chamdos(int iD_chamdos, int ID_chamados) {
		this.ID_chamados = ID_chamados;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Veiculo getkm_inicial() {
		return km_inicial;
	}
	public void setkm_inicial(Veiculo km_inicial) {
		this.km_inicial = km_inicial;
	}
	public Veiculo getKm_final() {
		return km_final;
	}

	public void setKm_final(Veiculo km_final) {
		this.km_final = km_final;
	}

	
	public List<Colaborador> getColaborador() {
		return colaborador;
	}
	public void setItensVenda(List<Colaborador> colaborador) {
		this.colaborador = colaborador;
	}

}      
