public class SugarDecorator  extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+20;
    }
}
