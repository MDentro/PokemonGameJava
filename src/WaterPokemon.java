import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name);
        this.setType("water");
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
        if (enemy.getType().equalsIgnoreCase("fire")) {
            number = 10;
        } else if (enemy.getType().equalsIgnoreCase("electric")) {
            if (type.equalsIgnoreCase("rainDance")) {
                System.out.println(name.getName() + " has no effect on " + enemy.getName() + ".");
            } else {
                number = 5;
            }
        } else if (enemy.getType().equalsIgnoreCase("grass")) {
            if (type.equalsIgnoreCase("rainDance")) {
                number = 5;
                enemy.setHp(enemy.getHp() + number);
                System.out.println(enemy.getName() + " wins " + number + "hp.");
            } else {
                number = 3;
            }
        } else {
            number = 1;
        }
        if (!type.equalsIgnoreCase("rainDance")) {
            enemy.setHp(enemy.getHp() - number);
            System.out.println(enemy.getName() + " loses " + number + "hp.");
        }

        System.out.println("The current hp level of " + enemy.getName() + " is " + enemy.getHp() + ".");
    }

    void surf(Pokemon name, Pokemon enemy) {
        String type = "surf";
        attack(name, enemy, type);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        String type = "hydroPump";
        attack(name, enemy, type);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        String type = "hydroCanon";
        attack(name, enemy, type);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        String type = "rainDance";
        attack(name, enemy, type);

    }
}
