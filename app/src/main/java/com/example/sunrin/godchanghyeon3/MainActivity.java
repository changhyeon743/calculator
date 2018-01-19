package com.example.sunrin.godchanghyeon3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView btn1;
    TextView btn2;
    TextView btn3;


    TextView btn4;
    TextView btn5;
    TextView btn6;

    TextView btn7;
    TextView btn8;
    TextView btn9;

    TextView btn0;
    TextView btn_equal;

    TextView btn_del;
    TextView btn_div;
    TextView btn_multi;
    TextView btn_minus;
    TextView btn_plus;

    TextView cal_ing;
    TextView cal_ed;

    String str = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("장애인");
        cal_ing = (TextView) findViewById(R.id.cal_ing);
        cal_ed = (TextView) findViewById(R.id.cal_ed);

        btn1 = (TextView) findViewById(R.id.btn1);
        btn2 = (TextView) findViewById(R.id.btn2);
        btn3 = (TextView) findViewById(R.id.btn3);

        btn4 = (TextView) findViewById(R.id.btn4);
        btn5 = (TextView) findViewById(R.id.btn5);
        btn6 = (TextView) findViewById(R.id.btn6);

        btn7 = (TextView) findViewById(R.id.btn7);
        btn8 = (TextView) findViewById(R.id.btn8);
        btn9 = (TextView) findViewById(R.id.btn9);

        btn0 = (TextView) findViewById(R.id.btn0);
        btn_equal = (TextView) findViewById(R.id.btn_equal);

        btn_del = (TextView) findViewById(R.id.btn_del);
        btn_div = (TextView) findViewById(R.id.btn_div);
        btn_multi = (TextView) findViewById(R.id.btn_multi);
        btn_minus = (TextView) findViewById(R.id.btn_minus);
        btn_plus = (TextView) findViewById(R.id.btn_plus);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_plus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                addStr('0');
                break;
            case R.id.btn1:
                str += "1";
                break;
            case R.id.btn2:
                str += "2";
                break;
            case R.id.btn3:
                str += "3";
                break;
            case R.id.btn4:
                str += "4";
                break;
            case R.id.btn5:
                str += "5";
                break;
            case R.id.btn6:
                str += "6";
                break;
            case R.id.btn7:
                str += "7";
                break;
            case R.id.btn8:
                str += "8";
                break;
            case R.id.btn9:
                str += "9";
                break;
            case R.id.btn_del:
                if(str.length() != 0)
                    str = str.substring(0, str.length() - 1);
                break;
            case R.id.btn_div:
                addStr('/');
                break;
            case R.id.btn_minus:
                addStr('-');
                break;
            case R.id.btn_multi:
                addStr('*');
                break;
            case R.id.btn_plus:
                addStr('+');
                break;


            case R.id.btn_equal:
                String a = str;
                //system.out.println(a);
                String operators[] = a.split("[0-9]+");
                String operands[] = a.split("[+\\-*/]");
                int agregate = Integer.parseInt(operands[0]);
                for (int i = 1; i < operands.length; i++) {
                    switch (operators[i]) {
                        case "+":
                            agregate += Integer.parseInt(operands[i]);
                            break;
                        case "-":
                            agregate -= Integer.parseInt(operands[i]);
                            break;
                        case "/":
                            agregate /= Integer.parseInt(operands[i]);
                            break;
                        case "*":
                            agregate *= Integer.parseInt(operands[i]);
                            break;
                    }

                }
                //cal_ed.setText(""+agregate);
                str = agregate + "";
                break;
        }
        cal_ing.setText(str);
    }

    void addStr(char fuck) {
        if (str.charAt(str.length() - 1) != '+'
                && str.charAt(str.length() - 1) != '-'
                && str.charAt(str.length() - 1) != '/'
                && str.charAt(str.length() - 1) != '*') {
            str += fuck;
        }
    }
}
