import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name);
        this.setType("grass");
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    List<String> getAttacks() {
        return attacks;
    }

    private void attack(Pokemon name, Pokemon enemy, String type) {
        int number = 0;
        System.out.println(name.getName() + " attacks " + enemy.getName() + " " + type + ".");
        if (enemy.getType().equalsIgnoreCase("electric")) {
            number = 10;
        } else if (enemy.getType().equalsIgnoreCase("fire")) {
            number = 5;
        } else if (enemy.getType().equalsIgnoreCase("water")) {
            number = 3;
        } else {
            number = 1;
        }
        if (type.equalsIgnoreCase("leechSeed")) {
            name.setHp(name.getHp() + number);
        }
        enemy.setHp(enemy.getHp() - number);
        System.out.println(enemy.getName() + " loses " + number + "hp.");
        System.out.println("The current hp level of " + enemy.getName() + " is " + enemy.getHp() + ".");
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        String type = "leafStorm";
        attack(name, enemy, type);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        String type = "solarBeam";
        attack(name, enemy, type);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        String type = "leechSeed";
        attack(name, enemy, type);
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        String type = "leaveBlade";
        attack(name, enemy, type);
    }
}
