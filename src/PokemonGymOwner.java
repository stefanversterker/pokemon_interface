import java.util.List;

public class PokemonGymOwner {
    private String name;
    private String town;
    private List<Pokemon> pokemons;


    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons){
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
