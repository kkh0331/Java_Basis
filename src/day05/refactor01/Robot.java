package day05.refactor01;

public class Robot {
    Machine location;
    String basket;
    
    public void moveToMachine(Machine location) {
    	this.location = location;
    }

    public void pickBasket() {
    	this.basket = location.takeBasket();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Robot");

        if (location != null)
            sb.append(" location=").append(location.getName());

        if (basket != null)
            sb.append(" bin=" ).append(basket);

        sb.append("\n");

        return sb.toString();
    }
}
