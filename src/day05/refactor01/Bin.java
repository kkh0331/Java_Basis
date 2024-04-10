package day05.refactor01;

public class Bin {

    private String basket;

    public void addBasket(String basket){
        this.basket = basket;
    }

    public void removeBasket(){
        basket = null;
    }

    public String getBasket(){
        return basket;
    }

}
