public class Witch extends Enemy {

    Witch(String name) {
        super(name);
    }

    @Override
    public void move() {
        super.move();
        System.out.print(" Dengan menaiki sapu terbang");
    }    
}
