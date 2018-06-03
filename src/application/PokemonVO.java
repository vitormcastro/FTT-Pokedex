package application;

import java.util.ArrayList;

public class PokemonVO {	
	
	private int pokemonID;
	private String nome;
	private ArrayList<String> tipo;
	private int total;
	private int attack;
	private int defense;
	private int sp_Attack;
	private int sp_Defense;
	private int speed;
	private int level;	

	public PokemonVO() {
		tipo = new ArrayList<String>();
	}	

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(int pokemonID) {
		this.pokemonID = pokemonID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getTipo() {
		return tipo;
	}
	public void setTipo(ArrayList<String> tipo) {
		this.tipo = tipo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getSp_Attack() {
		return sp_Attack;
	}
	public void setSp_Attack(int sp_Attack) {
		this.sp_Attack = sp_Attack;
	}
	public int getSp_Defense() {
		return sp_Defense;
	}
	public void setSp_Defense(int sp_Defense) {
		this.sp_Defense = sp_Defense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
