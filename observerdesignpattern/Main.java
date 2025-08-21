package observerdesignpattern;

public class Main {

    public static void main(String[] args){
        Investor john = new ConcreteInvestor("John");
        Investor smith = new ConcreteInvestor("Smith");


        AppleStock appleStock = new AppleStock();

        appleStock.registerObserver(john);
        appleStock.registerObserver(smith);
        appleStock.setPrice(150.2);

        appleStock.removeObserver(john);
        appleStock.setPrice(43.1);

    }
}
