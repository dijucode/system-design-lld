package observerdesignpattern;

public class ConcreteInvestor implements Investor{

    String name;

    public ConcreteInvestor(String name){
        this.name = name;
    }

    public void update(String stockName, double price){


        System.out.println(name + " is notified with " + stockName + " new price "+ price );



    }
}
