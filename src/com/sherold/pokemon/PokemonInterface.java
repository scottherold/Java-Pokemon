package com.sherold.pokemon;

public interface PokemonInterface {
	// Static method to create new pokemon (must be called from interface -- cannot be overidden)
	public static Pokemon createPokemon(String name, int health, String type) {
		// Instantiates a Pokemon
		Pokemon newPokemon = new Pokemon();
		
		// Sets attributes
		newPokemon.setName(name);
		newPokemon.setHealth(health);
		newPokemon.setType(type);
		
		return newPokemon;		
	}
	
	// Static method to list pokemon info (must be called from the interface -- cannot be overriden)
	public static String pokemonInfo(Pokemon pokemon) {
		return "Pokemon Information" +
				"\nPokemon Name: " + pokemon.getName() +
				"\nPokemon Health: " + pokemon.getHealth() +
				"\nPokemon Type: " + pokemon.getType() + "\n";
	}
	
	// Abstract method to print count from Pokemon class
	void listPokemon();
}
