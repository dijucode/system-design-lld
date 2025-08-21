package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class AppleStock implements Stock{

    List<Investor> investors;
    double price;

    public AppleStock(){
        investors = new ArrayList<>();
    }


    public void registerObserver(Investor investor){
        investors.add(investor);


    }

    public void removeObserver(Investor investor){
        investors.remove(investor);
    }

    public void notifyObservers(){
        for(Investor  investor: investors){
            investor.update("Apple", price);
        }
    }

    public void setPrice(double price){
        this.price = price;
        notifyObservers();
    }
}
