package day02;
/*
* [미니 과제]
* Q. 사람은 상점에서 핸드폰을 구매합니다.
* 쏘니가 핸드폰을 샀습니다.
* 베컴도 핸드폰을 샀습니다.
*
* 쏘니가 핸드폰을 켰습니다.
* "야 내 핸드폰 켜볼게"
* "삐비빅" (핸드폰이 내는 소리)
*
* 베컴도 핸드폰을 켰습니다.
* "turn on"
* "bbeep" (핸드폰이 내는 소리)
* */

/*
* 클래스 : 사람, 상점, 핸드폰
* 사람 내의 name field을 주석처리한 것은 딱히 필요없다고 생각해서 입니다.
* */

import java.util.HashMap;
import java.util.Map;

public class MiniTask01 {

    static Store store = new Store();
    public static void main(String[] args) {
        // 휴대폰이 상점에 추가
        Phone samsungPhone = new SamsungPhone();
        Phone applePhone = new ApplePhone();

        store.addPhone(samsungPhone, 1);
        store.addPhone(applePhone, 1);

        // 사람 생성
        Person sawny = new Person("쏘니", "kr");
        Person beckham = new Person("베컴", "en");

        // 휴대폰 구매
        sawny.buyPhone(store, samsungPhone);
        beckham.buyPhone(store, applePhone);

        // 쏘니가 핸드폰을 켰습니다.
        sawny.turnOnPhone();

        // 베컴도 핸드폰을 켰습니다.
        beckham.turnOnPhone();
    }
}

enum Brand {
    SAMSUNG, APPLE
}

class Person{

    private String name;
    private String nation;
    private Phone phone;

    Person(String name, String nation){
        this.name = name;
        this.nation = nation;
    }

    Person(String name){
        this.name = name;
    }

    void buyPhone(Store store, Phone phone){
        if(store.isPhone(phone)){
            this.phone = phone;
        } else {
            System.out.printf("상점에 %s이(가) 구매하려는 휴대폰이 없습니다.\n", name);
        }
    }

    void turnOnPhone(){
        if(phone == null){
            return;
        } else if(phone.getIsTurnOn()){
            System.out.printf("%s's phone is already turned on", name);
            return;
        }
        if(nation.equals("kr")){
            System.out.println("야 내 핸드폰 켜볼게");
        } else if(nation.equals("en")){
            System.out.println("turn on");
        } else {
            System.out.println("국적 미상");
        }
        phone.turnOn();
    }

}

abstract class Phone{

    private boolean isTurnOn;
    private Brand brand;

    Phone(Brand brand){
        this.isTurnOn = false;
        this.brand = brand;
    }

    boolean getIsTurnOn(){
        return isTurnOn;
    }

    Brand getBrand(){
        return brand;
    }

    abstract void openSound();

    void turnOn(){
        isTurnOn = true;
        openSound();
    }

}

class SamsungPhone extends Phone{

    SamsungPhone(){
        super(Brand.SAMSUNG);
    }

    @Override
    void openSound(){
        System.out.println("삐비빅");
    }

}

class ApplePhone extends Phone{

    ApplePhone(){
        super(Brand.APPLE);
    }

    @Override
    void openSound(){
        System.out.println("bbeep");
    }
}

class Store{
    // 상점 내에 핸드폰을 저장하고 있어야 함...
    Map<Brand, Integer> phones; // phone 종류, 개수

    Store(){
        phones = new HashMap<>();
    }

    void addPhone(Phone phone, int count){
        Brand phoneBrand = phone.getBrand();
        if(phones.containsKey(phoneBrand)){
            phones.replace(phoneBrand, phones.get(phoneBrand) + count);
        } else {
            phones.put(phoneBrand, count);
        }
    }

    boolean isPhone(Phone phone){
        Brand phoneBrand = phone.getBrand();
        if(phones.containsKey(phoneBrand)){
            if(phones.get(phoneBrand) == 1){
                phones.remove(phoneBrand);
            } else {
                phones.replace(phoneBrand, phones.get(phoneBrand) - 1);
            }
            return true;
        }
        return false;
    }
}