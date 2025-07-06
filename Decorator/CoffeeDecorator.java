// The abstract decorator class

abstract public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription(){
        return coffee.getDescription();
    }
    @Override
    public int getCost(){
        return coffee.getCost();
    }
}
