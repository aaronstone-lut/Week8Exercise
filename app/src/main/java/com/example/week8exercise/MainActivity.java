package com.example.week8exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inputFirstNumberField;
    private EditText inputSecondNumberField;

    private TextView textResultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputFirstNumberField = findViewById(R.id.inputFirstNumber);
        inputSecondNumberField = findViewById(R.id.inputSecondNumber);
        textResultField = findViewById(R.id.textResult);
    }

    public void add(View view)
    {
        double firstNumber = Double.parseDouble(String.valueOf(inputFirstNumberField.getText()));
        double secondNumber = Double.parseDouble(String.valueOf(inputSecondNumberField.getText()));
        DecimalFormat df = new DecimalFormat("0.00");
        textResultField.setText(df.format(firstNumber + secondNumber));
    }

    public void minus(View view)
    {
        double firstNumber = Double.parseDouble(String.valueOf(inputFirstNumberField.getText()));
        double secondNumber = Double.parseDouble(String.valueOf(inputSecondNumberField.getText()));
        DecimalFormat df = new DecimalFormat("0.00");
        textResultField.setText(df.format(firstNumber - secondNumber));
    }

    public void multiple(View view)
    {
        double firstNumber = Double.parseDouble(String.valueOf(inputFirstNumberField.getText()));
        double secondNumber = Double.parseDouble(String.valueOf(inputSecondNumberField.getText()));
        DecimalFormat df = new DecimalFormat("0.00");
        textResultField.setText(df.format(firstNumber * secondNumber));
    }

    public void divide(View view)
    {
        double firstNumber = Double.parseDouble(String.valueOf(inputFirstNumberField.getText()));
        double secondNumber = Double.parseDouble(String.valueOf(inputSecondNumberField.getText()));
        DecimalFormat df = new DecimalFormat("0.00");
        textResultField.setText(df.format(firstNumber / secondNumber));
    }
}