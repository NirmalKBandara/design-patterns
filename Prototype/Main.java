public class Main {
    public static void main(String[] args) {
        // Here we are creating a new object
        GameCharacter gameCharacter1 = new GameCharacter("Mithila", "Swprdsman", "Swords", 1);

        // instead of creating a whole nwe object we will create a clone and set the changing variables
        GameCharacter gameCharacter2 = gameCharacter1.clone();
        gameCharacter2.setName("Nirmal");

        GameCharacter gameCharacter3 = gameCharacter2.clone();
        gameCharacter3.setName("Kisaja");
        gameCharacter3.setType("Hours man");

        GameCharacter gameCharacter4 = gameCharacter3.clone();
        gameCharacter4.setName("Kalana");
        gameCharacter4.setType("Foot Solider");
        gameCharacter4.setWeapon("Spear");

        gameCharacter1.printCharacter();
        gameCharacter2.printCharacter();
        gameCharacter3.printCharacter();
        gameCharacter4.printCharacter();

    }
}