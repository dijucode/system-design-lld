package designparkinglot;

public class HourlyPriceStretegy extends PricingStretegy{
    int price;
    HourlyPriceStretegy(int price){
        super(price);
        this.price = price;


    }

    int getPrice(){
        return price;
    }
}
