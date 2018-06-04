package application;

import java.util.ArrayList;

public  class  Model {

	public static class LoginModel{
		
		public static TreinadorVO ValidateLogin(String nome, String senha) {
			//ToDO --> conectar com a classe DAO do lucas e verificar no banco
			//se está correto o login e senha
			return new TreinadorVO();
		}
	}
	
	public static class PokedexModel{
		
		public static ArrayList<PokemonVO> GetPokemon(int pag, int qtdd) {
			//ToDO --> conectar com a classe DAO do lucas e trazer qtdd de pokemons igual no parametro
			return new ArrayList<PokemonVO>();
		}
	}
}
