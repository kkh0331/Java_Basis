public class EX07 {
    public static void main(String[] args) {
        // 객체 생성
        // 2개 : 삼성, lg
        // 객체의 변수 (브랜드) 출력
        Notebook samsung = new Notebook("삼성");
        Notebook lg = new Notebook("LG");
        System.out.println(samsung.brand);
        System.out.println(lg.brand);
    }

}

class Notebook{
    String brand;

    Notebook(String brand){
        this.brand = brand;
    }
}
