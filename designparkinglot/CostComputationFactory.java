package designparkinglot;

public class CostComputationFactory {
    Ticket ticket;



//    return cost as per vihicle type and duration and houarly or flat rate or minute rate
    int getCost(Ticket ticket, long exitTime) {
        long duration = exitTime - ticket.entryTime;
        CostComputation costComputation;
        if (ticket.vehicle.vehicleType.equals("two_wheeler")) {
            if (duration <= 3600000) {
                costComputation = new CostComputation(new MinuitsWisePricingStretegy(10));
            } else {
                costComputation = new CostComputation(new HourlyPriceStretegy(10));
            }
        } else if (ticket.vehicle.vehicleType.equals("four_wheeler")) {
            if (duration <= 3600000) {
                costComputation = new CostComputation(new MinuitsWisePricingStretegy(20));
            } else {
                costComputation = new CostComputation(new HourlyPriceStretegy(20));
            }
        } else {
            if (duration <= 3600000) {
                costComputation = new CostComputation(new MinuitsWisePricingStretegy(30));
            } else {
                costComputation = new CostComputation(new HourlyPriceStretegy(30));
            }
        }
        return costComputation.computeCost();

    }

}
