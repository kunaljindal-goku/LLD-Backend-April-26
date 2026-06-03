import java.util.ArrayList;
import java.util.List;

public class IceCream {

    Cone cone;
    List<Topping> toppings;

    boolean isFestival;

    public IceCream(Cone cone) {
        this.cone = cone;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public int getCost() {
        int totalCost = 0;
        totalCost += cone.getCost();
        for(Topping topping: toppings) {
            if(topping instanceof Vanilla && isFestival) totalCost += topping.getCost()*0.5;
            else totalCost += topping.getCost();
        }

        return totalCost;
    }

    public String getDescription() {
        StringBuilder desc = new StringBuilder();
        desc.append(cone.getDescription()).append(",");
        for(Topping topping: toppings) desc.append(topping.getDescription()).append(",");

        return desc.toString();
    }
}
