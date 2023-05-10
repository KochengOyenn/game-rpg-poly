public class Character {
    private String name;
    private int hp;
    private int def;
    private int level;

    static int baseAtk;
    Weapon weapon;

    Character(String name) {
        this.name = name;
    }

    Character(String name, int hp, int def, int level) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.hp;
    }

    public void setHealth(int health){
        this.hp = health;
    }

    public int getDefense() {
        return this.def;
    }

    public void setDefense(int defense) {
        this.def = defense;
    }

    int getLevel(){
        return level;
    }

    public void move() {
        System.out.print("\n"+this.name + " Bergerak ");
    }

}
