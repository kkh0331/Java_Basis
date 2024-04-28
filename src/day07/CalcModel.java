package day07;

/*
* DB, 로직
* */

import day07.DTO.CalcDTO;

public class CalcModel {

    public int plus(CalcDTO calcDTO){
        return calcDTO.getNum1() + calcDTO.getNum2();
    }

}
