// This calss is the class which Builder use to build the product
// Client don't know about this calss
public class Burger{
    private String patty;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean sauce;

    public Burger(String patty, boolean cheese, boolean lettuce, boolean tomato, boolean sauce){
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.sauce = sauce;
    }
    public void display(){
        System.out.println("Patty: " + patty
        + "\nCheese: " + (cheese?"Yes":"No")
        + "\nLettuce: " + (lettuce?"Yes":"No")
        + "\nTomato: " + (tomato?"Yes":"No")
        + "\nSauce: " + (sauce?"Yes":"No"));
    }
}
