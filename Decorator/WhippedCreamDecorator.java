public class WhippedCreamDecorator  extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + WhippedCream";
    }

    @Override
    public int getCost() {
        return super.getCost()+50;
    }
}
