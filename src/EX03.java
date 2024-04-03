public class EX03 {

    /*
    다음 if문을 switch로 변경하세요
    if(age >= 30){
        System.out.println("30대입니다.");
    } else if(age >= 20){
        System.out.println("20대입니다.");
    } else if(age >= 10){
        System.out.println("10대입니다.");
    } else {
        System.out.println("어린이입니다.");
    }
    */

    public static void main(String[] args) {
        int age = 27;
        ifToSwitch(age);
    }

    public static void ifToSwitch(int age){
        switch (age/10){
            case 3:
                System.out.println("30대입니다.");
                break;
            case 2:
                System.out.println("20대입니다.");
                break;
            case 1:
                System.out.println("10대입니다.");
                break;
            default:
                System.out.println("어린이입니다.");
                break;
        }
    }
}

