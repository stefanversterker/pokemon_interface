import org.w3c.dom.ls.LSOutput;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int hp, int level, String food, String sound){
        super(name, hp, level, food, sound);

        attacks.add("surf");
        attacks.add("hydropump");
        attacks.add("hydrocanon");
        attacks.add("raindance");
    }

    void surf(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 4, "Surf");
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 8, "HydroPump");
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 12, "HydroCanon");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("electric")) {
            System.out.println("RainDance has no effect on " + enemy.getName());
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " absorbs the rain and gains 4 hp!");
            enemy.setHp(enemy.getHp() + 4);
            System.out.println(enemy.getName() + "'s HP is now " + enemy.getHp());
        } else {
            DamageCalculator.performAttack(name, enemy, 16, "RainDance");
        }
    }

    @Override
    public void attack(Pokemon name, Pokemon enemy, String moveName) {
    }

    @Override
    String getType() {
        return "water";
    }


}
