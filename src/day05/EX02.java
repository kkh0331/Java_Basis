package day05;

public class EX02 {

    int _quantity;
    int _itemPrice;
    int discountLevel;

    int getDiscountLevel(){
        return discountLevel;
    }

//    double getDiscountedPrice(int basePrice, int discountLevel){
//        // discountLevel 스위치 => 퍼센트
//        return basePrice * 0.08;
//    }
    double getDiscountedPrice(){
        // discountLevel 호출
        return _quantity * _itemPrice * 0.08;
    }

    void  method(){
//        원래 문제!! -> 클린코드가 아니다
//        int basePrice = _quantity * _itemPrice;
//        discountLevel = getDiscountLevel();
//        double finalPrice = getDiscountedPrice(basePrice, discountLevel);

        double finalPrice = getDiscountedPrice();
        System.out.printf("최종 금액은 %f달러 입니다.\n", finalPrice);
    }
}
