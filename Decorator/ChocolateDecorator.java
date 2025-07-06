public class ChocolateDecorator  extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + Chocolate";
    }

    @Override
    public int getCost() {
        return super.getCost()+40;
    }
}
