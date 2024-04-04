package day02;

// 상속
public class EX04 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.ride();
        bus.getWheelNum();

        Car taxi = new Taxi(); // 부모 클래스로 감쌀 경우 자식 클래스에서 새롭게 생성한 메소드 사용 불가
        taxi.ride();
        taxi.getWheelNum();
    }
}

// 부모 클래스는 자식 클래스의 공통된 성질
// 자식부터 설계하고, 부모 설계한다.
class Car{

    int wheel = 4;

    void getWheelNum(){
        System.out.printf("바귀의 수는 %d개 입니다.\n", wheel);
    }

    void ride(){
        System.out.println("빵빵!!");
    }

}

// 버스
// 택시
// 메소드 : 달린다 (버스 - 부릉부릉, 택시 - 빵빵);
class Bus extends Car{

//    int wheel = 4;

    Bus(){
        // super() -> 부모 생성자가 숨겨져 있음(호출)
        super();
    }

//    void getWheelNum(){
//        System.out.printf("바귀의 수는 %d개 입니다.\n", wheel);
//    }
//
    void ride(){
        System.out.println("부릉부릉");
    }

    void ring(){
        System.out.println("삐이익~~");
    }
}

class Taxi extends Car{

//    int wheel = 4;
//
//    void getWheelNum(){
//        System.out.printf("바귀의 수는 %d개 입니다.\n", wheel);
//    }
//
    void ride(){
        System.out.println("부아앙~");
    }
}