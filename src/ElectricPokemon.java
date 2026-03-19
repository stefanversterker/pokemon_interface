public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int hp, int level, String food, String sound){
        super(name, hp, level, food, sound);

        attacks.add("thunderpunch");
        attacks.add("electroball");
        attacks.add("thunder");
        attacks.add("volttackle");
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 4, "ThunderPunch");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 8, "ElectroBall");
    }

    void thunder(Pokemon name, Pokemon enemy){
        //'Thunder levert een hp boost aan electric Pokemons'. Ik ben er nu vanuit gegaan dat dit geldt voor zowel aanvaller als verdediger.
        name.setHp(name.getHp() + 4);
        System.out.println(name.getName() + "'s HP is boosted with 4 points and is now " + name.getHp());
        if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() + 4);
            System.out.println(enemy.getName() + "'s HP is boosted with 4 points and is now " + enemy.getHp());
        }
        DamageCalculator.performAttack(name, enemy, 12, "Thunder");
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        DamageCalculator.performAttack(name, enemy, 16, "VoltTackle");
    }

    @Override
    String getType() {
        return "electric";
    }

    @Override
    public void attack(Pokemon name, Pokemon enemy, String moveName) {

    }
}
