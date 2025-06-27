public class GameCharacter implements Cloneable{
    private String name;
    private String type;
    private String weapon;
    private int level;

    public GameCharacter(String name, String type, String weapon, int level) {
        this.name = name;
        this.type = type;
        this.weapon = weapon;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getWeapon() {
        return weapon;
    }
    public int getLevel(){
        return level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public GameCharacter clone(){
        return new GameCharacter(name, type, weapon, level);
    }
    public void printCharacter(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weapon: " + weapon);
        System.out.println("Level: " + level);
        System.out.println(" ");
    }


}
