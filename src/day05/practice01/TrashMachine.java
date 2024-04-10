package day05.practice01;

public class TrashMachine implements TrashMachineable, PrintStatusAble {
    protected String name;
    protected Basket basket;
    protected Location currentLocation;

    public TrashMachine(String name, Basket basket, Location location){
        this.name = name;
        this.basket = basket;
        this.currentLocation = location;
    }

    @Override
    public Basket giveBasket() {
        Basket temp = basket;
        this.basket = null;
        return temp;
    }

    @Override
    public void getBasketFrom(TrashMachineable trashMachine) {
        this.basket = trashMachine.giveBasket();
    }

    @Override
    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    @Override
    public void printStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s : location: %s", this.name, this.currentLocation.getName()));
        if(basket != null)
            sb.append(" Basket: " + basket.getName());

        sb.append('\n');
        System.out.print(sb);
    }
}