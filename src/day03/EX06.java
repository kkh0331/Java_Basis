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
    }
}
class ApplePhone{

    private final int BATTERY_MAX_CAPA = 100;
    private int batteryStatus = 70;
    private boolean isOn = true;

    void charge(){
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

    void operateKakaotalk(){
        if(isOn){
            batteryStatus -= 5;
            if(batteryStatus == 0){
                turnOff();
            }
        }
    }

    void operateYoutube(){
        if(isOn){
           if(batteryStatus == 10 || batteryStatus == 5){
               batteryStatus = 0;
               turnOff();
               return;
           }
           batteryStatus -= 10;
        }
    }

    void checkBatteryStatus(){
        System.out.println(batteryStatus+"%");
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    boolean getIsOn(){
        return isOn;
    }
}

class Person{

    ApplePhone phone;

    void buyPhone(ApplePhone phone){
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
