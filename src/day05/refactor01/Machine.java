package day05.refactor01;

public class Machine {
    String name;
    Bin bin;

    public Machine(String name) {
        this.name = name;
    }

    public String takeBasket() {
        String result = bin.getBasket();
        bin.removeBasket();
        return result;
    }

    public void putBasket(String basket) {
        bin.addBasket(basket);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Machine : ").append(name);

        if (bin.getBasket() != null)
            sb.append("bin = ").append(bin.getBasket());

        sb.append("\n");
        return sb.toString();
    }
}