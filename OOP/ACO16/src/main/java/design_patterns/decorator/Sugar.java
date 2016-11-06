package design_patterns.decorator;

/**
 * Created by gorobec on 06.11.16.
 */
public class Sugar extends BeverageCondiment{

    public Sugar(String name, double price, Beverage beverage) {
        super(name, price, beverage);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + beverage.getPrice();
    }

    @Override
    public String getName() {
        return super.getName() + " + " + beverage.getName();
    }
}
