package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.buttonConvert);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=findViewById(R.id.editTextCelsius);
                String temp = editText.getText().toString();
                ConvertTemp cv = new ConvertTemp();
                double cf = cv.celsiusToFahrenheit(Double.parseDouble(temp));
                double ck = cv.celsiusToKelvin(Double.parseDouble(temp));
                //double fc = cv.celsiusToFahrenheit(Double.parseDouble(temp));

                EditText fa = (EditText)findViewById(R.id.editTextFahreinheit);
                fa.setText(String.valueOf(cf)+"F");

                EditText ke = (EditText)findViewById(R.id.editTextKelvin);
                ke.setText(String.valueOf(ck)+"K");


            }
        });

    }
}