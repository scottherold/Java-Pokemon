import com.sherold.pokemon.*;

public class PokemonTest {

	public static void main(String[] args) {
		PokeDex pd1 = new PokeDex();
		
		pd1.newPokemon("Charmander", 100, "Fire");
		pd1.newPokemon("Squirtle", 100, "Water");
		pd1.newPokemon("Bulbasaur", 100, "Grass");
		
		pd1.listPokemon();
	}

}
