package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // getSound(동물) : 매개변수.cry();
        // class Dog, Cat extends Pat
        // cry()

        Garden garden = new Garden();
        Pet dog = new Dog();
        Pet cat = new Cat();
        garden.getSound(dog);
        garden.getSound(cat);
    }
}

class Garden{
    void getSound(Pet pet){
        pet.cry();
    }
}

abstract class Pet{
    abstract void cry();
}

class Dog extends Pet{
    @Override
    void cry(){
        System.out.println("멍멍~");
    }
}

class Cat extends Pet{
    @Override
    void cry(){
        System.out.println("야옹~");
    }
}

