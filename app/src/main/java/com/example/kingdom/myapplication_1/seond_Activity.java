package com.example.kingdom.myapplication_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class seond_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seond_);
        Button button_1=(Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(seond_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        final LinearLayout linearLayout=findViewById(R.id.LinearLayout_2);
        Button button_2=(Button)findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        Button button_3=(Button)findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setOrientation(LinearLayout.VERTICAL);
            }
        });
        Button button_4=(Button)findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setOrientation(Gravity.LEFT);
            }
        });
    }
}
