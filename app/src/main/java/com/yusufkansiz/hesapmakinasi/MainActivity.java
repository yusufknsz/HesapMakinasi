package com.yusufkansiz.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text =findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.textView);


    }
    public void toplama(View view){
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2= Integer.parseInt(number2Text.getText().toString());

        int result= number1 + number2;
        resultText.setText("Result"+ result);
    }
    public void cikarma (View view){
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2= Integer.parseInt(number2Text.getText().toString());

        int result= number1 - number2;
        resultText.setText("Result"+ result);

    }
    public void bolme(View view){
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2= Integer.parseInt(number2Text.getText().toString());

        int result= number1 / number2;
        resultText.setText("Result"+ result);

    }
    public void carpma(View view){
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2= Integer.parseInt(number2Text.getText().toString());

        int result= number1 * number2;
        resultText.setText("Result"+ result);

    }

}