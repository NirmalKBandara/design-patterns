public class NimalFactory implements ShoeFactory{
    @Override
    public SportShoes createShoes() {
        return new NirmalShoes();
    }

}
