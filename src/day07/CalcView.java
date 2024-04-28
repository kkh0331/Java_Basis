package day07;

import day07.DTO.CalcDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame implements ActionListener {

    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();
    JButton btn_plus = new JButton("더하기");
    JLabel la_result = new JLabel("결과 출력");

    CalcController calcController;

    CalcView(CalcController calcController){
        this.calcController = calcController;
        btn_plus.addActionListener(this);

        setTitle("Swing 실습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);
        setLayout(null);

        tf_num1.setBounds(50, 50, 50, 40);
        tf_num2.setBounds(100, 50, 50, 40);
        btn_plus.setBounds(150,50, 80, 40);
        la_result.setBounds(50, 100, 200, 40);

        add(tf_num1);
        add(tf_num2);
        add(btn_plus);
        add(la_result);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 더하기 버튼이 클릭되면,
        if(btn_plus.equals(e.getSource())){
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());
            la_result.setText(Integer.toString(calcController.plus(new CalcDTO(num1, num2))));
        }
    }
}
