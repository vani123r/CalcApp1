package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {

        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberSumTV = findViewById(R.id.answer);
        if (number1ET.getText().toString().equals("")){
            numberSumTV.setText("ENTER NUM");
        }
       else if (number2ET.getText().toString().equals("")){
            numberSumTV.setText("ENTER NUM");
        }
       else {
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }

    }
    public void subtract(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberSubTV = findViewById(R.id.answer);
        if (number1ET.getText().toString().equals("")){
            numberSumTV.setText("ENTER NUM");
        }
        else if (number2ET.getText().toString().equals("")){
            numberSumTV.setText("ENTER NUM");
        }
        else {
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double sub = num1 - num2;

            numberSubTV.setText("" + sub);
        }
    }
    public void multiply(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberMultTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt(number1ET.getText().toString());
        double num2 = Integer.parseInt(number2ET.getText().toString());
        double mult = (num1 * num2);

        numberMultTV.setText("" + mult);

    }
    public void divide(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberDivTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt(number1ET.getText().toString());
        double num2 = Integer.parseInt(number2ET.getText().toString());
        double div = (num1/num2);

        numberDivTV.setText("" + div);

    }


}