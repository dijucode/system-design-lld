package decoratordesignpattern;

public class VeggieDelightPizza extends BasePizza{


    int price = 300;

    public String getDescription(){
        return "VeggieDelightPizza";
    }

    public int getPrice(){
        return price;

    }
}