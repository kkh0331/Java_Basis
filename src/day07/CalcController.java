package day07;

import day07.DTO.CalcDTO;

public class CalcController {

    CalcModel calcModel;

    public CalcController(CalcModel calcModel){
        this.calcModel = calcModel;
        new CalcView(this);
    }

    public int plus(CalcDTO calcDTO){
        return calcModel.plus(calcDTO);
    }

}
