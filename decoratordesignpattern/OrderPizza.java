package decoratordesignpattern;

public class OrderPizza {

    public static void main(String[] args){

        BasePizza basePizza =new OliveTopping(new CheeseTopping(new VeggieDelightPizza()));

        System.out.println(basePizza.getDescription());

        System.out.println(basePizza.getPrice());


    }
}
