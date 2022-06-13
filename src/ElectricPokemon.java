import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private List<String> attacks = Arrays.asList("electroBall", "voltTackle", "thunderPunch", "thunder" );

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name);
        this.setType("electric");
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
        if (enemy.getType().equalsIgnoreCase("water")) {
            number = 10;
        } else if (enemy.getType().equalsIgnoreCase("grass")) {
            number = 5;
        } else if (enemy.getType().equalsIgnoreCase("fire")) {
            number = 3;
        } else {
            number = 1;
        }

        if (type.equalsIgnoreCase("thunder")) {
            if (name.getName().equalsIgnoreCase("electric")) {
                name.setHp(name.getHp() + 2);
            }
        }
        if (type.equalsIgnoreCase("thunder")) {
            if (enemy.getName().equalsIgnoreCase("electric")) {
                number = number - 2;
                enemy.setHp(enemy.getHp() - number);
            } else {
                enemy.setHp(enemy.getHp() - number);
            }
        }

        System.out.println(enemy.getName() + " loses " + number + "hp.");
        System.out.println("The current hp level of " + enemy.getName() + " is " + enemy.getHp() + ".");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        String type = "electroBall";
        attack(name, enemy, type);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        String type = "voltTackle";
        attack(name, enemy, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        String type = "thunderPunch";
        attack(name, enemy, type);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        String type = "thunder";
        attack(name, enemy, type);
    }
}
