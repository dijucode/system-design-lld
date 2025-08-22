package decoratordesignpattern;

public class CheeseTopping extends ToppingDecorator {


    BasePizza basepizza;

    public CheeseTopping(BasePizza basepizza){

        this.basepizza = basepizza;

    }

    @Override
    public String getDescription() {
        return basepizza.getDescription() + " => " + " CheeseTopping";
    }

    @Override
    public int getPrice() {
        return basepizza.getPrice()+ 70;
    }
}
