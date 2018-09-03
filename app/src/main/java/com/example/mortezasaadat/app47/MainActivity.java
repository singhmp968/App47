package com.example.mortezasaadat.app47;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Typeface fontName1;
    Typeface fontName2;


    TextView txtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fontName1 = Typeface.createFromAsset(getAssets(), "fonts/FontleroyBrown.ttf");
        fontName2 = Typeface.createFromAsset(getAssets(), "fonts/Wonderbar Demo.otf");

         txtValue = (TextView) findViewById(R.id.txtValue);
        Button btnFont1 = (Button) findViewById(R.id.btnFont1);
        Button btnFont2 = (Button) findViewById(R.id.btnFont2);

        btnFont1.setOnClickListener(MainActivity.this);
        btnFont2.setOnClickListener(MainActivity.this);




        txtValue.setTextSize(50);




    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.btnFont1:


                txtValue.setTypeface(fontName1);


                break;

           case R.id.btnFont2:

            txtValue.setTypeface(fontName2);

            break;

        }



    }
}
