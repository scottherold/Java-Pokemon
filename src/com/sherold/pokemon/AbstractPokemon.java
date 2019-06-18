package com.sherold.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	// Create Pokemon
	public static Pokemon createPokemon(String name, int health, String type) {		
		return PokemonInterface.createPokemon(name, health, type);
	};
	
	// List pokemon
	public static String pokemonInfo(Pokemon pokemon) {
		return PokemonInterface.pokemonInfo(pokemon);
	}
}
