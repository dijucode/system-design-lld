package designparkinglot;

public class CostComputation {

    PricingStretegy pricingStretegy;
    int price;
    public CostComputation(PricingStretegy pricingStretegy) {
//        logic for cost computation
        this.pricingStretegy = pricingStretegy;
        this.price = pricingStretegy.getPrice();



    }

    public int computeCost(){
        return price;
    }

}
