public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name, int hp, int level, String food, String sound){
        super(name, hp, level, food, sound);

        attacks.add("leafstorm");
        attacks.add("solarbeam");
        attacks.add("leechseed");
        attacks.add("leaveblade");
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 4, "LeafStorm");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        DamageCalculator.performAttack(name, enemy, 8, "SolarBeam");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " takes 4 hitpoints from " + enemy.getName());
        name.setHp(name.getHp() + 4);
        enemy.setHp(enemy.getHp() - 4);
        System.out.println(name.getName() + "'s HP is now: " + name.getHp());
        System.out.println(enemy.getName() + "'s HP is now: " + enemy.getHp());
        DamageCalculator.performAttack(name, enemy, 12, "LeechSeed");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 16, "LeaveBlade");
    }

    @Override
    String getType() {
        return "grass";
    }

    @Override
    public void attack(Pokemon name, Pokemon enemy, String moveName) {

    }
}
