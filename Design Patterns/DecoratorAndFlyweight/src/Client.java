import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Cone c1 = new WaffleCone();
        Topping t1 = new Chocolate();
        Topping t2 = new Vanilla();


        IceCream iceCream = new IceCream(c1);
        iceCream.addTopping(t1);
        iceCream.addTopping(t2);

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
