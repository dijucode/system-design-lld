package decoratordesignpattern;

public class MargheritaPizza extends BasePizza{


    int price = 100;

    public String getDescription(){
        return "MargheritaPizza";
    }

    public int getPrice(){
        return price;

    }
}
