public class Main {
    public static void main(String[] args){
        // We have to create a Burger
        // So instead of making it by our self we call a builder
        // We should tell him what we wants
        // Then he creates the burger and gives to us
        // Here used the method channing property for simplicity
        Burger burger = new BurgerBuilder()
               .setPatty("Beef")
               .addCheese(true)
               .addTomato(false)
               .addSauce(true)
               .addLettuce(true)
               .build();

//       BurgerBuilder builder = new BurgerBuilder();
//       builder.setPatty("Beef");
//       builder.addCheese(true);
//       builder.addTomato(false);
//       builder.addSauce(true);
//       builder.addLettuce(true);
//       Burger burger =   builder.build();
       burger.display();
    }
}