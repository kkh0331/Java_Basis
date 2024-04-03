public class EX01 {
    // 점수를 받는 변수, 87점
    // 90점 이상 : "A"
    // 80점 이상 : "B"
    // 70점 이상 : "C"
    // 나머지 : "F"
    public static void main(String[] args){
        int score = 87;
        char grade = scoreToGrade(score);
        System.out.printf("\"%c\"", grade);
    }

    public static char scoreToGrade(int score){
        if(score >= 90) return 'A';
        else if(score >= 80) return 'B';
        else if(score >= 70) return 'C';
        else return 'F';
    }

}
