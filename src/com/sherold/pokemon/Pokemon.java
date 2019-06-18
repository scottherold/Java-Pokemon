package com.sherold.pokemon;

public class Pokemon {
	// < ----- Attributes ----->
	protected String name;
	protected int health;
	protected String type;
	
	// Static attributes for PokeDex
	private static int count;
	
	// <----- Constructors ----->
	public Pokemon() {
		// Adds additional Pokemon to PokeDex count
		count++;
	}

	// <----- Getters/Setters ----->
	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// health
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	// type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// <----- Methods ----->
	public void attack(Pokemon target) {
		target.health -= 10;
	}
	
}
