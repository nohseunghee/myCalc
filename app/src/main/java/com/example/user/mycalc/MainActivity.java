package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText    etNum1, etNum2;
    TextView    txtResult;
    Button      btnPlus, btnMinus, btnMutiple, btnDivision, btnExtra;

    float num1, num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1      = (EditText)findViewById(R.id.etNum1);
        etNum2      = (EditText)findViewById(R.id.etNum2);
        btnPlus     = (Button)findViewById(R.id.btnPlus);
        btnMinus    = (Button)findViewById(R.id.btnMinus);
        btnMutiple  = (Button)findViewById(R.id.btnMutiple);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        btnExtra    = (Button)findViewById(R.id.btnExtra);
        txtResult   = (TextView)findViewById(R.id.txtResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etNum1.getText().toString());
                num2 = Float.parseFloat(etNum2.getText().toString());

                txtResult.setText("계산 결과: "+(num1+num2) );
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etNum1.getText().toString());
                num2 = Float.parseFloat(etNum2.getText().toString());

                txtResult.setText("계산 결과: "+(num1-num2) );

            }
        });

        btnMutiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etNum1.getText().toString());
                num2 = Float.parseFloat(etNum2.getText().toString());

                txtResult.setText("계산 결과: "+(num1*num2) );

            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etNum1.getText().toString());
                num2 = Float.parseFloat(etNum2.getText().toString());

                if(num2 == 0) {
                    Toast.makeText(getApplicationContext(), "0은 안됨", Toast.LENGTH_LONG).show();
                }else{
                    txtResult.setText("계산 결과: " + (num1 / num2));
                }
            }
        });

        btnExtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etNum1.getText().toString());
                num2 = Float.parseFloat(etNum2.getText().toString());

                if(num2 == 0) {
                    Toast.makeText(getApplicationContext(), "0은 안됨", Toast.LENGTH_LONG).show();
                }else{
                    txtResult.setText("계산 결과: " + (num1 % num2));
                }

            }
        });
    }

}
