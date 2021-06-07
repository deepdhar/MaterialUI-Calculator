package com.example.android.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout c_button, percentage_button, back_button, divide_button, multiply_button, minus_button, add_button, equals_button,
    button_9, button_8, button_7, button_6, button_5, button_4, button_3, button_2, button_1, button_0, button_00, button_dot;

    private TextView res_tv, past_tv;

    private String res = "", operation = "";
    private int temp;

    private String past = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res_tv = findViewById(R.id.res_tv);
        past_tv = findViewById(R.id.tv_1);

        c_button = findViewById(R.id.c_button);
        percentage_button = findViewById(R.id.percentage_button);
        back_button = findViewById(R.id.back_button);
        divide_button = findViewById(R.id.divide_button);
        multiply_button = findViewById(R.id.multiply_button);
        minus_button = findViewById(R.id.minus_button);
        add_button = findViewById(R.id.addition_button);
        equals_button = findViewById(R.id.button_equals);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);
        button_00 = findViewById(R.id.button_00);
        button_dot = findViewById(R.id.button_dot);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "0";
                res_tv.setText(res);
            }
        });

        button_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "00";
                res_tv.setText(res);
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "1";
                res_tv.setText(res);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "2";
                res_tv.setText(res);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "3";
                res_tv.setText(res);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "4";
                res_tv.setText(res);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "5";
                res_tv.setText(res);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "6";
                res_tv.setText(res);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "7";
                res_tv.setText(res);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "8";
                res_tv.setText(res);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res += "9";
                res_tv.setText(res);
            }
        });



        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    int len = res.length();
                    res = res.substring(0, len - 1);
                    res_tv.setText(res);
                }
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    temp = Integer.parseInt(res);
                    past = res + "+";
                    res = "";
                    res_tv.setText(res);
                    operation = "add";
                }
            }
        });

        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    temp = Integer.parseInt(res);
                    past = res + "-";
                    res = "";
                    res_tv.setText(res);
                    operation = "minus";
                }
            }
        });

        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    temp = Integer.parseInt(res);
                    past = res + "x";
                    res = "";
                    res_tv.setText(res);
                    operation = "multiply";
                }
            }
        });

        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    temp = Integer.parseInt(res);
                    past = res + "/";
                    res = "";
                    res_tv.setText(res);
                    operation = "divide";
                }
            }
        });

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    int ans = Integer.parseInt(res);
                    past += res;
                    switch (operation) {
                        case "add":
                            ans += temp;
                            operation = "";
                            break;
                        case "minus":
                            ans = temp - ans;
                            operation = "";
                            break;
                        case "multiply":
                            ans *= temp;
                            operation = "";
                            break;
                        case "divide":
                            ans = temp / ans;
                            operation = "";
                            break;
                        default:
                            return;
                    }
                    res = String.valueOf(ans);
                    res_tv.setText(res);
                    past_tv.setText(past);
                    temp = 0;
                }
            }
        });

        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!res.isEmpty()) {
                    res = "";
                    past = "";
                    res_tv.setText(res);
                    past_tv.setText(past);
                }
            }
        });
    }
}