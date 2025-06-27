// This is the Builder class
// Where do everything client says
public class BurgerBuilder {
    private String patty;
    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean sauce = false;


    public BurgerBuilder setPatty(String patty){
        this.patty = patty;
        return this;
    }
    public BurgerBuilder addCheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }
    public BurgerBuilder addLettuce(boolean lettuce){
        this.lettuce = lettuce;
        return this;
    }
    public BurgerBuilder addTomato(boolean tomato){
        this.tomato = tomato;
        return this;
    }
    public BurgerBuilder addSauce(boolean sauce){
        this.sauce = sauce;
        return this;
    }

    // This is the builder method
    // Where create the final product after clients thoughts
    public Burger build(){
        return new Burger(patty, cheese, lettuce, tomato, sauce);
    }
}
