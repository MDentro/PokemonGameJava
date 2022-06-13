import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name);
        this.setType("fire");
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
        if (enemy.getType().equalsIgnoreCase("grass")) {
            number = 10;
        } else if (enemy.getType().equalsIgnoreCase("water")) {
            number = 5;
        } else if (enemy.getType().equalsIgnoreCase("electric")) {
            number = 3;
        } else {
            number = 1;
        }
        enemy.setHp(enemy.getHp() - number);
        System.out.println(enemy.getName() + " loses " + number + "hp.");
        System.out.println("The current hp level of " + enemy.getName() + " is " + enemy.getHp() + ".");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        String type = "fireLash";
        attack(name, enemy, type);
    };

    void flameThrower(Pokemon name, Pokemon enemy) {
        String type = "flameThrower";
        attack(name, enemy, type);
    };
    void pyroBall(Pokemon name, Pokemon enemy) {
        String type = "pyroBall";
        attack(name, enemy, type);
    };

    void inferno(Pokemon name, Pokemon enemy){
        String type = "inferno";
        attack(name, enemy, type);
    };
}
