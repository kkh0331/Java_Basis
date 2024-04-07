package day03;

import java.util.ArrayList;
import java.util.List;

public class EX01 {
    public static void main(String[] args) {
        // Cow, Chicken : cry() - "음메", "꼬끼오"
        // Farm : getSound() - cow, chicken => 각각의 cry 호출
        // Animal : 상속 - 오버라이딩

        Farm farm = new Farm();

        Animal cow = new Cow();
        Animal chicken = new Chicken();

        farm.addAnimal(cow);
        farm.addAnimal(chicken);

        farm.getSound();

    }
}

class Farm{

    List<Animal> animals;

    Farm(){
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal){
        animals.add(animal);
    }

    void getSound(){
        for (Animal animal : animals) {
            animal.cry();
        }
    }

}

class Animal{
    void cry(){
        System.out.println("울어요~");
    }
}

class Cow extends Animal{
    @Override
    void cry(){
        System.out.println("음메");
    }
}

class Chicken extends Animal{
    @Override
    void cry(){
        System.out.println("꼬끼오");
    }
}