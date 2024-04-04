package day01;

public class EX02 {
    // num 변수의 값이 9면 "A"
    // 8이면 "B"
    // 7이면 "C"
    // 6이하면 "F"
    public static void main(String[] args) {
        int num = 8;
        char grade = numToGrade(num);
        System.out.printf("\"%c\"", grade);
    }

    public static char numToGrade(int num){
        switch(num){
            case 9:
                return 'A';
//                break;
            case 8:
                return 'B';
//                break;
            case 7:
                return 'C';
//                break;
            default:
                return 'F';
        }
    }
}
