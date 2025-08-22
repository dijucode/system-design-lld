package decoratordesignpattern;

public class FarmHousePizza extends BasePizza{


    int price = 200;

    public String getDescription(){
        return "FarmHousePizza";
    }

    public int getPrice(){
        return price;

    }
}