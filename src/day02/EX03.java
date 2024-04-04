package day02;

public class EX03 {
    public static void main(String[] args) {
        Person2 dragono = new Person2("용용이", 26, "010-1111-1111");
    }
}

class Person2{

    String name;
    int age;
    String phone;

    Person2(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

}