import java.util.Random;

public class Bow extends Weapon {

    Bow(String name, int atk, int condition, boolean isBroken) {
        super(name, atk, condition, isBroken);
    }

//Overriding Method]

    static int randomAtk(Weapon w){
        Random rand = new Random(); 
        int rndmAtk = (rand.nextInt(25) + 10) * w.getAttack() /100 ;
        return rndmAtk;
    }
    
}
