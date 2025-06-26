public class BimalFactory implements ShoeFactory {
    @Override
    public SportShoes createShoes(){
        return new BimalShoes();
    }
}
