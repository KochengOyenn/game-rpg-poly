import java.util.Random;

public class Weapon {
    private String name;
    private int atk;
    private int condition = 100;
    private boolean isBroken;
    
    Weapon(String name, int atk, int condition, boolean isBroken){
        this.name = name;
        this.atk = atk;
        this.condition = condition;
        this.isBroken = isBroken;
    }

    public String getName(){
        return this.name;
    }

    public int getAttack(){
        return this.atk;
    }

    public int getCondition(){
        return this.condition;
    }

    public void setIsBroken(boolean broken) {
        this.isBroken = broken;
    }

    public void repair(){
        this.condition = 100;
        this.isBroken = false;
    }

    public void use(){
        this.condition -= 10;
        if (this.condition == 0) {
            this.isBroken = true;
        }
    }

    static int randomAtk(Weapon w){
        Random rand = new Random(); 
        int rndmAtk = (rand.nextInt(20) + 10) * w.getAttack() /100 ;
        return rndmAtk;
    }

}

