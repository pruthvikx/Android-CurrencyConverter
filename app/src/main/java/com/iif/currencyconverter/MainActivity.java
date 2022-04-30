package com.iif.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
        String amountInPounds = amountEditText.getText().toString();
        double amountDoubleEditText = Double.parseDouble(amountInPounds);
        double amountInDollars = amountDoubleEditText * 1.26;
        String amountInStringDollars = String.format("%.2f",amountInDollars);
        Toast.makeText(this, amountInPounds +" P = $ " + amountInStringDollars, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}