public class DamageCalculator {

    public static double multiplier(Pokemon attacker, Pokemon defender) {

        String attackerType = attacker.getType();
        String defenderType = defender.getType();

        switch (attackerType) {

            case "fire":
                switch (defenderType) {
                    case "grass":
                        return 3.0;
                    case "water":
                        return 2;
                    case "fire":
                        return 0.5;
                    default:
                        return 1.0;
                }

            case "water":
                switch (defenderType) {
                    case "fire":
                        return 3.0;
                    case "electric":
                        return 2.0;
                    case "water":
                        return 0.5;
                    default:
                        return 1.0;
                }

            case "grass":
                switch (defenderType) {
                    case "electric":
                        return 3.0;
                    case "fire":
                        return 2.0;
                    case "grass":
                        return 0.5;
                    default:
                        return 1.0;
                }

            case "electric":
                switch (defenderType) {
                    case "water":
                        return 3.0;
                    case "grass":
                        return 2.0;
                    case "electric":
                        return 0.5;
                    default:
                        return 1.0;
                }

            default:
                return 1.0;
        }
    }

    public static void performAttack(Pokemon attacker, Pokemon defender, int base, String attack){
        double netDamage = base * multiplier(attacker, defender);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with a " + attack);
        System.out.println(defender.getName() + " loses " + netDamage + " hp.");
        defender.setHp(defender.getHp() - (int) netDamage);
        System.out.println(defender.getName() + "'s HP is now " + defender.getHp());
    }
}