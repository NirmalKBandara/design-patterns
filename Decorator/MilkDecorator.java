public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }

    @Override
    public int getCost() {
        return super.getCost()+30;
    }
}
