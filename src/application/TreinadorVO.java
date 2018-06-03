package application;

import java.util.ArrayList;

class TreinadorVO {	
	
	private int treinadorID;
	private	String nome;
	private String senha;
	private String Regiao;
	private ArrayList<PokemonVO> pokemonsCapturados;
	
	public TreinadorVO() {
		pokemonsCapturados = new ArrayList<PokemonVO>();
	}
	
	public int getTreinadorID() {
		return treinadorID;
	}
	public void setTreinadorID(int treinadorID) {
		this.treinadorID = treinadorID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegiao() {
		return Regiao;
	}
	public void setRegiao(String regiao) {
		Regiao = regiao;
	}
	public ArrayList<PokemonVO> getPokemonsCapturados() {
		return pokemonsCapturados;
	}
	public void setPokemonsCapturados(ArrayList<PokemonVO> pokemonsCapturados) {
		this.pokemonsCapturados = pokemonsCapturados;
	}

}
