package day05.practice01;

public class Basket {
    private String name;
    private int capacity;

    Basket(String name) {
        this.name = name;
        this.capacity = 100;
    }

    public void addTrash(int trashAmount) {
        if (trashAmount <= 0) {
            System.out.printf("Trash Amount cannot be less than or equal to 0\n");
            return;
        }

        if (this.capacity + trashAmount > 100) {
            System.out.printf("%s is Full\n", name);
            return;
        }

        this.capacity += trashAmount;
    }

    public String getName() {
        return name;
    }

    public void clear() {
        this.capacity = 0;
    }
}
