public class Main{
    public static void main(String [] args){
        ShoeFactory f;
        f = new NimalFactory();

        SportShoes shoes = f.createShoes() ;

        shoes.displayInfo();
    }
}

