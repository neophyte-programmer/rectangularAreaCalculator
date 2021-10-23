package com.example.rectangularareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    // Declaring variables
    EditText mEditWidth;
    EditText mEditLength;
    TextView mTextResult;
    Button mButtonArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Assigning variables to the various buttons and text areas
        mEditWidth = (EditText) findViewById(R.id.editWidth);
        mEditLength = (EditText) findViewById(R.id.editLength);
        mTextResult = (TextView) findViewById(R.id.textResult);
        mButtonArea = (Button) findViewById(R.id.buttonArea);

        mButtonArea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }
    // Creating a class for the calculation
    public void calculate(){
        // Variables to store input
        Double value1 = Double.parseDouble(mEditWidth.getText().toString());
        Double value2 = Double.parseDouble(mEditLength.getText().toString());
        // Variable to store result of calculation
        Double calculateValue = value1 * value2;

        mTextResult.setText(calculateValue.toString());
    }
}