package day03;

public class EX06 {
    public static void main(String[] args) {
        // ApplePHone : 배터리 용량(졍수) 100
        // charge() : +10
        // useKakaotalk() : -5
        // useYoutube() : - 10
        // 배터리 용량 확인
        // turnOn
        // turnOff

        // Person => ApplePhone 모든 기능 사용 가능
        // ApplePhone => SamsungPhone 변환

        Person son = new Person();

        ApplePhone iphone16 = new ApplePhone();
        son.buyPhone(iphone16);

        SamsungPhone galaxy2223 = new SamsungPhone();
        son.buyPhone(galaxy2223);
    }
}
class ApplePhone implements Phone{

    private final int BATTERY_MAX_CAPA = 100;
    private int batteryStatus = 70;
    private boolean isOn = true;

    public void charge(){
        if(batteryStatus == BATTERY_MAX_CAPA){
            System.out.println("100%입니다");
            return;
        } else if(batteryStatus == 95){
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }
        System.out.println(batteryStatus+"%가 되었습니다.");
    }

    public void operateKakaotalk(){
        if(isOn){
            batteryStatus -= 5;
            if(batteryStatus == 0){
                turnOff();
            }
        }
    }

    public void operateYoutube(){
        if(isOn){
           if(batteryStatus == 10 || batteryStatus == 5){
               batteryStatus = 0;
               turnOff();
               return;
           }
           batteryStatus -= 10;
        }
    }

    public void checkBatteryStatus(){
        System.out.println(batteryStatus+"%");
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public boolean getIsOn(){
        return isOn;
    }
}

class SamsungPhone implements Phone{

    private final int BATTERY_MAX_CAPA = 100;
    private int batteryStatus = 80;
    private boolean isOn = true;

    public  void charge(){
        if(batteryStatus == BATTERY_MAX_CAPA){
            System.out.println("100%입니다");
            return;
        } else if(batteryStatus == 95){
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }
        System.out.println(batteryStatus+"%가 되었습니다.");
    }

    public void operateKakaotalk(){
        if(isOn){
            batteryStatus -= 5;
            if(batteryStatus == 0){
                turnOff();
            }
        }
    }

    public void operateYoutube(){
        if(isOn){
            if(batteryStatus == 10 || batteryStatus == 5){
                batteryStatus = 0;
                turnOff();
                return;
            }
            batteryStatus -= 10;
        }
    }

    public void checkBatteryStatus(){
        System.out.println(batteryStatus+"%");
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public boolean getIsOn(){
        return isOn;
    }
}

interface Phone{
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게 타입형태로 제시하기 위함
    //    => implements Phone
    //    * 추상클래스는 extends 공통 기능 상속, 규약 구현
    //    * 인터페이스는 implements 공통 규약, 구현
    // 2. 구현체를 필요 = 구현체 사용 = 메소드를 호출 => 메소드 선언(명, 매개변수) 통일
    //    * 인터페이스는 implements 공통 규약, 구현

    // 인터페이스는 무조건 public -> 왜?? 모든 프로젝트에서 다중으로 사용할 수 있기 때문에

    void charge();

    void operateKakaotalk();

    void operateYoutube();

    void checkBatteryStatus();

    void turnOn();

    void turnOff();

    boolean getIsOn();
}

class Person{

    Phone phone;

    void buyPhone(Phone phone){
        this.phone = phone;
    }

    void chargePhone(){
        phone.charge();
    }

    void useKakaotalk(){
        if(phone.getIsOn()){
            phone.operateKakaotalk();
        }
    }
}
