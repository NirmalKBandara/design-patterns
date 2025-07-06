public class Main {
    public static void main(String[] args) {

        // Simply we need to buy a coffee
        // After that we have to add some ingredients
        // To do this we use interface of the product we want and
        // An abstract class of decorator
        // Then we have to extends abstract decorator to all decorator classes
        // And implements the methods from Product interface to the abstract decorator class

        Coffee coffee = new PlainCoffee();
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.getCost());
//        System.out.println(" ");

        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.getCost());
//        System.out.println(" ");

        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.getCost());
//        System.out.println(" ");

        coffee = new WhippedCreamDecorator(coffee);
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.getCost());
//        System.out.println(" ");

        coffee = new ChocolateDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
        System.out.println(" ");

    }
}