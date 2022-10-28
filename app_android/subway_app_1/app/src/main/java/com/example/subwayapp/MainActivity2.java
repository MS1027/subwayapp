package com.example.subwayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;
    private CheckBox cb7;
    private CheckBox cb8;

    private TextView mTextTest;

    private Button Button1;
    private Button Button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CheckBox cb1 = (CheckBox)findViewById(R.id.checkbox1);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkbox2);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkbox3);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkbox4);
        CheckBox cb5 = (CheckBox)findViewById(R.id.checkbox5);
        CheckBox cb6 = (CheckBox)findViewById(R.id.checkbox6);
        CheckBox cb7 = (CheckBox)findViewById(R.id.checkbox7);
        CheckBox cb8 = (CheckBox)findViewById(R.id.checkbox8);



        Button moveButton1=findViewById(R.id.button01);
        moveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        Button moveButton2=findViewById(R.id.button02);
        moveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });


    }


}