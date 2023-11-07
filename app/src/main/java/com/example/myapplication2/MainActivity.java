package com.example.myapplication2;

import static com.example.myapplication2.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button one,two,three,fuor,five,six,seven,eight,nine,zero,plus,subtraction,beat,split,equal;
String number1="";
String number2="";
String operation="";

    private void setNumbers(String number){
        if (operation.isEmpty()){
            number1+=number;
        }else {
            number2+=number;
        }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        TextView text = findViewById(R.id.text3);
        one = findViewById(R.id.one_text);
        two = findViewById(R.id.two_text);
        three = findViewById(R.id.three_text);
        fuor = findViewById(R.id.four_text);
        five = findViewById(R.id.five_text);
        six = findViewById(id.six_text);
        seven = findViewById(id.seven_text);
        eight = findViewById(id.eight_text);
        nine = findViewById(R.id.nine_text);
        zero = findViewById(R.id.zero_text);
        plus = findViewById(R.id.plus_text);
        subtraction = findViewById(R.id.subtraction_text);
        beat = findViewById(id.beat_text);
        split = findViewById(id.split_text);
        equal = findViewById(id.equal_text);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="1";
                }else {
                    number2+="1";
                }
                text.setText(number1+operation+number2);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="2";
                }else {
                    number2+="2";
                }
                text.setText(number1+operation+number2);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="3";
                }else {
                    number2+="3";
                }
                text.setText(number1+operation+number2);
            }
        });
        fuor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.isEmpty()){
                    number1+="4";
                }else {
                    number2+="4";
                }
                text.setText(number1+operation+number2);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="5";
                }else {
                    number2+="5";
                }
                text.setText(number1+operation+number2);            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="6";
                }else {
                    number2+="6";
                }
                text.setText(number1+operation+number2);            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="7";
                }else {
                    number2+="7";
                }
                text.setText(number1+operation+number2);            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="8";
                }else {
                    number2+="8";
                }
                text.setText(number1+operation+number2);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="9";
                }else {
                    number2+="9";
                }
                text.setText(number1+operation+number2);            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation!=null||operation!=""){
                    number1+="0";
                }else {
                    number2+="0";
                }
                text.setText(number1+operation+number2);            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="+";
                text.setText(number1+operation+number2);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="-";
                text.setText(number1+operation+number2);
            }
        });
        beat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="x";
                text.setText(number1+operation+number2);
            }
        });
        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="/";
                text.setText(number1+operation+number2);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                switch (operation) {
                    case "+":
                        result = Double.parseDouble(number1) + Double.parseDouble(number2);
                        break;
                    case "-":
                        result = Double.parseDouble(number1) - Double.parseDouble(number2);
                        break;
                    case "x":
                        result = Double.parseDouble(number1) * Double.parseDouble(number2);
                        break;
                    case "/":
                        result = Double.parseDouble(number1) / Double.parseDouble(number2);
                        break;
                    default:
                        result = 0;
                        break;
                }
                text.setText(result+"");
            }
        });
    }
}