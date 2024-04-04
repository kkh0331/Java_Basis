package day02;

public class EX02 {
    public static void main(String[] args) {
        Coffee americano = new Coffee(4500, "ice", "tall");
//        americano.price = 4500;
//        americano.temp = "ice";
//        americano.size = "tall";
        americano.setPrice(6000);
        americano.getInfo();

        System.out.println();

        Barista chunsik = new Barista("춘식");
        chunsik.getCoffeeInfo(americano); // "이 커피는 4500원입니다."
        chunsik.makeCoffee(); // "커피 여기 있습니다~"
    }
}

// 커피
// 필드(= 멤버 변수) : 가격, 핫 or 아이스, 사이즈
// 메소드 : getInfo - sout(가격, 핫, 사이즈)
class Coffee{
    private int price;
    private String temp;
    private String size;

    Coffee(int price, String temp, String size){
        this.price = price;
        this.temp = temp;
        this.size = size;
    }

    void setPrice(int price){
        // 필드 값 설정 'set'
        // 변경할 값을 검증하는 용도로도 사용 가능
        if(price >= this.price) {
            this.price = price;
        }
    }

    int getPrice(){
        return price;
    }

    void getInfo(){
        System.out.printf("이 커피는 가격이 %d원이고, %s이고, 사이즈는 %s입니다.\n", price, temp, size);
    }
}

/*
* Barista chunsik = new Barista("춘식");
* chunsik.getCoffeeInfo(); => "이 커피는 4500원입니다."
* chunsik.makeCoffee(); => "커피 여기 있습니다~"
* */

class Barista{

    String name;

    Barista(String name){
        this.name = name;
    }

    void getCoffeeInfo(Coffee coffee){
        System.out.printf("이 커피는 %d원입니다.\n", coffee.getPrice());
    }

    void makeCoffee(){
        System.out.println("커피 여기 있습니다~");
    }
}