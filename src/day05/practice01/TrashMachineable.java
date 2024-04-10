package day05.practice01;

public interface TrashMachineable {
    Basket giveBasket();
    void getBasketFrom(TrashMachineable trashMachine);
    Location getCurrentLocation();
}
