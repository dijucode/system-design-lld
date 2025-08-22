package decoratordesignpattern;

public class OliveTopping extends ToppingDecorator {


        BasePizza basepizza;

        public OliveTopping(BasePizza basepizza){

            this.basepizza = basepizza;

        }

        @Override
        public String getDescription() {
            return basepizza.getDescription() + " => " + " OliveTopping";
        }

        @Override
        public int getPrice() {
            return basepizza.getPrice()+ 90;
        }
    }
