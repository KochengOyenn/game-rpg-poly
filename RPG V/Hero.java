public class Hero extends Character {
    static int baseAtk = 58;

    Hero(String name) {
        super(name);
    }

    Hero(String name, int hp, int def, int level) {
        super(name, hp, def, level);
    }

    Hero(String name, int hp, int def, int level, int baseAtk, Weapon weapon) {
        super(name, hp, def, level);
        Enemy.baseAtk = baseAtk;
        this.weapon = weapon;
    }

    public int getBaseAttack() {
        return baseAtk;
    }

    public void attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - ((this.getLevel() * this.getBaseAttack()) + (this.weapon.getAttack() + Weapon.randomAtk(weapon)) - enemy.getDefense()));
        enemy.setDefense(0);
    }

    public void doubleAttack(Enemy enemy) {
        attack(enemy);
        attack(enemy);
    }    

    void defense() {
        this.setDefense(this.getBaseAttack() * this.getLevel() / 2);
    }

    void heal(){
        this.setHealth(this.getHealth() + 100);
    }

    public void ultimate (Enemy enemy){
        if (this.getHealth() <= this.getHealth() * 0.2) {
            this.attack(enemy);
            this.attack(enemy);
            this.attack(enemy);
        } else {
            this.attack(enemy);
            this.attack(enemy);        
        }
        this.heal();
    }

    @Override
    public void move() {
        super.move();
        System.out.print("WUSHHHH!");
    }

    public void move(String direction) {
        System.out.print("\n"+this.getName() + " Bergerak ke" + direction);
    }
}
