import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon implements Attack {
    private String name;
    private int hp;
    private int level;
    private String food;
    private String sound;

    List<String> attacks = new ArrayList<>();

    public Pokemon(String name, int hp, int level, String food, String sound){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }

    String getName() {
        return this.name;
    }

    int getHp() {
        return this.hp;
    }

    int getLevel() {
        return this.level;
    }

    String getFood() {
        return this.food;
    }

    String getSound() {
        return this.sound;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    abstract String getType();


    void setName(String name) {
        this.name = name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    void setLevel(int level) {
        this.level = level;
    }

    @Override
    public abstract void attack(Pokemon name, Pokemon enemy, String moveName);
}
