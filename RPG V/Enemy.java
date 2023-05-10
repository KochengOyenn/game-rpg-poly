public class Enemy extends Character {
    static int baseAtk = 46;

//Constructor
    Enemy(String name) {
        super(name);
    }

    Enemy(String name, int hp, int def, int level) {
        super(name, hp, def, level);
    }

    Enemy(String name, int hp, int def, int level, int baseAtk, Weapon weapon) {
        super(name, hp, def, level);
        Enemy.baseAtk = baseAtk;
        this.weapon = weapon;
    }

//Method
    public int getBaseAttack() {
        return baseAtk;
    }

    public void attack(Hero hero) {
        hero.setHealth(hero.getHealth() - ((this.getLevel() * this.getBaseAttack()) + (this.weapon.getAttack() + Weapon.randomAtk(weapon)) - hero.getDefense()));
        hero.setDefense(0);
    }

    public void doubleAttack(Hero hero) {
        attack(hero);
        attack(hero);
    }    

    void defense() {
        this.setDefense(this.getBaseAttack() * this.getLevel() / 2);
    }
    
    void remedy() {
        this.setHealth(this.getHealth() + 100);
    }

    public void ultimate (Hero hero){
        if (this.getHealth() <= this.getHealth() * 0.2) {
            this.attack(hero);
            this.attack(hero);
            this.attack(hero);
        } else {
            this.attack(hero);
            this.attack(hero);        
        }
        remedy();
    }

    @Override
    public void move() {
        super.move();
        System.out.print("SREPETT...");
    }

    public void move(int step) {
        super.move();
        System.out.print(step + " langkah");
    }
}
