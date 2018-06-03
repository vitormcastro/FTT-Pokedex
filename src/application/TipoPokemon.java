package application;

public enum TipoPokemon {
	Bug(1),
	Dark(2),
	Dragon(3),
	Electric(4),
	Fairy(5),
	Fight(6),
	Fire(7),
	Flying(8),
	Ghost(9),
	Grass(10),
	Ground(11),
	Ice(12),
	Normal(13),
	Poison(14),
	Psychic(15),
	Rock(16),
	Steel(17),
	Water(18);
	
	private final int valor;
	
	TipoPokemon(int valorOpcao) {
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}

}
