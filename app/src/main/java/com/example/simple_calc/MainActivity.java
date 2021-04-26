package com.example.simple_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_num1,et_num2;
        Button bt_sum,bt_sub,bt_mul,bt_dev;
        TextView tv;
        et_num1=findViewById(R.id.et_num1);
        et_num2=findViewById(R.id.et_num2);
        bt_sum=findViewById(R.id.bt_sum);
        bt_sub=findViewById(R.id.bt_sub);
        bt_mul=findViewById(R.id.bt_mul);
        bt_dev=findViewById(R.id.bt_dev);
        tv=findViewById(R.id.tv);
        bt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= et_num1.getText().toString();
                String num2= et_num2.getText().toString();
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);
                double result =number1+number2;
                tv.append(String.valueOf(result));
            }
        });
        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= et_num1.getText().toString();
                String num2= et_num2.getText().toString();
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);
                double result =number1-number2;
                tv.append(String.valueOf(result));
            }
        });
        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= et_num1.getText().toString();
                String num2= et_num2.getText().toString();
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);
                double result =number1*number2;
                tv.append(String.valueOf(result));
            }
        });
        bt_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= et_num1.getText().toString();
                String num2= et_num2.getText().toString();
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);
                double result =number1/number2;
                tv.append(String.valueOf(result));
            }
        });

    }
}