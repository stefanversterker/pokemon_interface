import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);


        attacks.add("inferno");
        attacks.add("pyroball");
        attacks.add("firelash");
        attacks.add("flamethrower");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        DamageCalculator.performAttack(name, enemy, 12, "FireLash");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        DamageCalculator.performAttack(name, enemy, 16, "FlameThrower");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        DamageCalculator.performAttack(name, enemy, 8, "Pyroball");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        DamageCalculator.performAttack(name, enemy, 4, "Inferno");
    }


    @Override
    String getType() {
        return "fire";
    }

    @Override
    public void attack(Pokemon name, Pokemon enemy, String moveName) {

    }
}
