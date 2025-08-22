package decoratordesignpattern;

public class PaneerTopping extends ToppingDecorator {


        BasePizza basepizza;

        public PaneerTopping(BasePizza basepizza){

            this.basepizza = basepizza;

        }

        @Override
        public String getDescription() {
            return basepizza.getDescription() + " => " + " PaneerTopping";
        }

        @Override
        public int getPrice() {
            return basepizza.getPrice()+ 120;
        }
    }