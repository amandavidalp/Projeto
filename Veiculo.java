package model;

public class Veiculo {
	
	private int ID_veiculo;
	private String modelo;;
	
	public Veiculo(String modelo, String quilometragem, String consumo) {
		this.modelo = modelo;

	}
	public Veiculo() {
	}
	
	public int getID() {
		return ID_veiculo;
	}
	public String getmodelo() {
		return modelo;
	}
}
