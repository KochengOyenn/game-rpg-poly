public class Fighter extends Hero {

    Fighter(String name) {
        super(name);
    }

    @Override
    public void move() {
        super.move();
        System.out.print(" Dengan menunggang kuda");
}
    
}
