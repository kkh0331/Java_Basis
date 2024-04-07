package day03;

public class EX04 {
    public static void main(String[] args) {
        // 레시피 - 슈퍼 : getInfo => sout(이 레시피는 00의 레시피입니다.)
        // 파스타레시피 - 자식 : makeSource ~
        // 스테이크레시피 - 자식 : grill ~
        PastaRecipe pastaRecipe = new PastaRecipe("홍길동");
        pastaRecipe.getInfo();
        pastaRecipe.makeSource();

        SteakRecipe steakRecipe = new SteakRecipe("임꺽정");
        steakRecipe.getInfo();
        steakRecipe.grill();
    }
}

class Recipe {

    String name;

    Recipe(String name){
        this.name = name;
    }

    void getInfo(){
        System.out.printf("이 레시피는 %s 쉐프님의 레시피입니다.\n", name);
    };
}

class PastaRecipe extends Recipe {

    PastaRecipe(String name){
        super(name);
    }

    void makeSource(){
        System.out.println("소스를 만들고 있습니다.");
    }
}

class SteakRecipe extends Recipe {

    SteakRecipe(String name){
        super(name);
    }

    void grill(){
        System.out.println("고기를 굽고 있습니다.");
    }
}