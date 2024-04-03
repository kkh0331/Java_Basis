public class EX06 {
    public static void main(String[] args) {

        Person songa = new Person("손가");
        Person kelly = new Person("캘리");
        Person jason = new Person("제이슨");

        System.out.println(kelly.name);

    }
}

class Person{
    // 변수 (=부품)
    String name;

    Person(String name){
        this.name = name;
    }

}
