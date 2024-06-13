package com.example.zad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zad2.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText euroEditText, dollarEditText, euroRateEditText, dollarRateEditText;
    private TextView resultEuroTextView, resultDollarTextView;
    private Button convertEuroButton, convertDollarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euroEditText = findViewById(R.id.evri);
        dollarEditText = findViewById(R.id.dolari);
        euroRateEditText = findViewById(R.id.kurs_evro);
        dollarRateEditText = findViewById(R.id.kurs_dolar);
        resultEuroTextView = findViewById(R.id.resultEuroTextView);
        resultDollarTextView = findViewById(R.id.resultDollarTextView);
        convertEuroButton = findViewById(R.id.convertEuroButton);
        convertDollarButton = findViewById(R.id.convertDollarButton);

        convertEuroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double euroAmount = Double.parseDouble(euroEditText.getText().toString());
                double euroRate = Double.parseDouble(euroRateEditText.getText().toString());
                double result = euroAmount * euroRate;
                resultEuroTextView.setText("Iznos u dinarima za eure: " + new DecimalFormat("0.00").format(result));
            }
        });

        convertDollarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dollarAmount = Double.parseDouble(dollarEditText.getText().toString());
                double dollarRate = Double.parseDouble(dollarRateEditText.getText().toString());
                double result = dollarAmount * dollarRate;
                resultDollarTextView.setText("Iznos u dinarima za dolare: " + new DecimalFormat("0.00").format(result));
            }
        });
    }
}
