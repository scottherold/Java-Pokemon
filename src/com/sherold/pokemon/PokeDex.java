package com.sherold.pokemon;
import java.util.ArrayList;

public class PokeDex extends AbstractPokemon {
	// <----- Attributes ----->
	private ArrayList<Pokemon> myPokemon;
	
	// <----- Constructors ----->
	public PokeDex() {
		myPokemon = new ArrayList<Pokemon>();
	}
	
	// <----- Methods ----->
	// Create Pokemon
	public Pokemon newPokemon(String name, int health, String type) {		
		Pokemon newPokemon = createPokemon(name, health, type);
		myPokemon.add(newPokemon);
		return newPokemon;
	};
	
	// Calls pokemonInfo for each Pokemon
	@Override
	public void listPokemon() {
		for (Pokemon p : myPokemon) {
			System.out.println(pokemonInfo(p));
		}
	}

}
