package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String currVal = "";
String prevVal = "";
Double val1 = 0.0;
Double val2 = 0.0;
String mode = "";
boolean isDouble = false;
TextView operationString;
TextView valueString;

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
        operationString = findViewById(R.id.operationString);
        valueString = findViewById(R.id.valueString);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "0";
                valueString.setText(currVal);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "1";
                valueString.setText(currVal);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "2";
                valueString.setText(currVal);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "3";
                valueString.setText(currVal);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "4";
                valueString.setText(currVal);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "5";
                valueString.setText(currVal);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "6";
                valueString.setText(currVal);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "7";
                valueString.setText(currVal);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "8";
                valueString.setText(currVal);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal += "9";
                valueString.setText(currVal);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal = "";
                valueString.setText(currVal);
                if (prevVal.compareTo("") == 0) isDouble = false;
            }
        });

        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currVal = "";
                prevVal = "";
                valueString.setText("");
                operationString.setText("");
                mode = "";
                isDouble = false;
                val1 = 0.0;
                val2 = 0.0;
            }
        });

        //If (isDouble) prevents multiple decimals being placed
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isDouble) {
                    currVal += ".";
                    valueString.setText(currVal);
                    isDouble = true;
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Disables changing sign when no value exists
                if (currVal.compareTo("") == 0) return;

                Double temp = Double.parseDouble(currVal) * -1;
                currVal = temp.toString();
                valueString.setText(currVal);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total;

                if (prevVal.compareTo("") != 0) val1 = Double.parseDouble(prevVal);
                if (currVal.compareTo("") != 0) val2 = Double.parseDouble(currVal);

                switch (mode){
                    case "plus":
                        total = val1 + val2;
                        operationString.setText(val1.toString() + " + " + val2.toString() + " = " + total.toString());
                        valueString.setText(total.toString());
                        val1 = total;
                        currVal = "";
                        prevVal = "";
                        break;
                    case "minus":
                        total = val1 - val2;
                        operationString.setText(val1.toString() + " - " + val2.toString() + " = " + total.toString());
                        valueString.setText(total.toString());
                        val1 = total;
                        currVal = "";
                        prevVal = "";
                        break;
                    case "multiply":
                        total = val1 * val2;
                        operationString.setText(val1.toString() + " * " + val2.toString() + " = " + total.toString());
                        valueString.setText(total.toString());
                        val1 = total;
                        currVal = "";
                        prevVal = "";
                        break;
                    case "divide":
                        total = val1 / val2;
                        operationString.setText(val1.toString() + " / " + val2.toString() + " = " + total.toString());
                        valueString.setText(total.toString());
                        val1 = total;
                        currVal = "";
                        prevVal = "";
                        break;

                    default:
                        return;
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = "plus";
                if(val1 != 0.0){
                    operationString.setText(val1.toString() + " + ");
                    currVal = "";
                    valueString.setText("");
                }
                else if (prevVal.compareTo("") == 0){
                    prevVal = currVal;
                    operationString.setText(prevVal + " + ");
                    currVal = "";
                    valueString.setText("");
                }
                //Runs when changing operation
                else{
                    currVal = "";
                    valueString.setText("");
                    operationString.setText(prevVal + " + ");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = "minus";
                if(val1 != 0.0){
                    operationString.setText(val1.toString() + " - ");
                    currVal = "";
                    valueString.setText("");
                }
                else if (prevVal.compareTo("") == 0){
                    prevVal = currVal;
                    operationString.setText(prevVal + " - ");
                    currVal = "";
                    valueString.setText("");
                }
                //Runs when changing operation
                else{
                    currVal = "";
                    valueString.setText("");
                    operationString.setText(prevVal + " - ");
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = "multiply";
                if(val1 != 0.0){
                    operationString.setText(val1.toString() + " * ");
                    currVal = "";
                    valueString.setText("");
                }
                else if (prevVal.compareTo("") == 0){
                    prevVal = currVal;
                    operationString.setText(prevVal + " * ");
                    currVal = "";
                    valueString.setText("");
                }
                //Runs when changing operation
                else{
                    currVal = "";
                    valueString.setText("");
                    operationString.setText(prevVal + " * ");
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = "divide";
                if(val1 != 0.0){
                    operationString.setText(val1.toString() + " / ");
                    currVal = "";
                    valueString.setText("");
                }
                else if (prevVal.compareTo("") == 0){
                    prevVal = currVal;
                    operationString.setText(prevVal + " / ");
                    currVal = "";
                    valueString.setText("");
                }
                //Runs when changing operation
                else{
                    currVal = "";
                    valueString.setText("");
                    operationString.setText(prevVal + " / ");
                }
            }
        });



    }
}
