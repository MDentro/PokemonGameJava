public class PokemonTrainer extends PokemonGymImpl {
    public PokemonTrainer(String userA) {
        this.setName(userA);
        this.setCharizard(new FirePokemon("charizard", 1, 10, "fire", "fire"));
        this.setBlastoise(new WaterPokemon("blastoise", 2, 10, "water", "water"));
        this.setVenusaur(new GrassPokemon("venusaur", 3, 10, "grass", "grass"));
        this.setDitto(new GrassPokemon("ditto", 3, 15, "grass", "grass"));
        this.setRaichu(new ElectricPokemon("raichu", 4, 5, "electric", "electric"));
        this.setGyarados(new WaterPokemon("gyarados", 2, 5, "water", "water"));
    }
}
