public class App {
    public static void main(String[] args) {

        System.out.print("Case 1");
        // Static Polymorphism pada class Hero
        Hero hero = new Hero("Hero");
        hero.move();                        // memanggil method move() dari class Hero
        hero.move("kanan");       // memanggil method move(String) dari class Hero

        // Static Polymorphism pada class Anemy
        Enemy anemy = new Enemy("Enemy");
        anemy.move();                       // memanggil method move() dari class Anemy
        anemy.move(3);                 // memanggil method move(int) dari class Anemy

        System.out.print("\n\nCase 2");
        // Dynamic Polymorphism sebuah referensi dari class Karakter ke objek class Kero, Anemy, Fighter, dan Witch
        Character[] listCharacter = new Character[4];
        listCharacter[0] = new Hero("Super Hero");
        listCharacter[1] = new Enemy("Super Enemy");
        listCharacter[2] = new Fighter("Fighter");
        listCharacter[3] = new Witch("Witch");

        for (int i = 0; i < listCharacter.length; i++) {
            listCharacter[i].move();
        }

        System.out.print("\n\nCase 3");
       // Dynamic Polymorphism sebuah referensi dari class Karakter ke objek Witch yang berubah (di cast) menjadi objek Fighter
        Character ch = new Witch("Who");
        ch = new Fighter("Joko");
        ch.move();
    }
}