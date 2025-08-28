package designparkinglot;

public class MinuitsWisePricingStretegy extends PricingStretegy{


    int price;


    MinuitsWisePricingStretegy(int price){
        super(price);
        this.price = price;

    }

    @Override
    public int getPrice() {
        return price;
    }

}
