package observerdesignpattern;

public interface Stock {
    public void registerObserver(Investor investor);
    public void removeObserver(Investor investor);
    public void notifyObservers();

//    public void setPrice(double price); we can't keep it here because not every stock keep updated their stock manually
}
