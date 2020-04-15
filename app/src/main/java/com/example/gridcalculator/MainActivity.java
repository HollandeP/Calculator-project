package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String currVal = "";
boolean isDouble = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clear = findViewById(R.id.clear);
        Button clearEverything = findViewById(R.id.clearEverything);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        Button sign = findViewById(R.id.sign);
        Button decimal = findViewById(R.id.decimal);
        Button equals = findViewById(R.id.equals);
        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        final TextView totalString = findViewById(R.id.totalString);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "0";
                totalString.setText(currVal);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "1";
                totalString.setText(currVal);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "2";
                totalString.setText(currVal);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "3";
                totalString.setText(currVal);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "4";
                totalString.setText(currVal);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "5";
                totalString.setText(currVal);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "6";
                totalString.setText(currVal);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "7";
                totalString.setText(currVal);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "8";
                totalString.setText(currVal);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "9";
                totalString.setText(currVal);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal = "";
                totalString.setText(currVal);
            }
        });

        //If (isDouble) prevents multiple decimals being placed
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isDouble) {
                    currVal += ".";
                    totalString.setText(currVal);
                    isDouble = true;
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDouble){
                    Double temp = Double.parseDouble(currVal) * -1;
                    currVal = temp.toString();
                    totalString.setText(currVal);
                }
                else{
                    Integer temp = Integer.parseInt(currVal) * -1;
                    currVal = temp.toString();
                    totalString.setText(currVal);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
