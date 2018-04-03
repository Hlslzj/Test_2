package com.example.kingdom.myapplication_1;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class four_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_);
        Button button_1=(Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        /*ImageView imageView=new ImageView(this);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.p1));
        this.setContentView(imageView);*/
        //ImageView imageView=(ImageView)findViewById(R.id.image_1);
        //imageView.setImageLevel(1);

    }
    int cnt=0;
    Timer timer=new Timer();
    TimerTask task=new TimerTask() {
        @Override
        public void run() {
            if(cnt%5==0){
                ImageView imageView=(ImageView)findViewById(R.id.image_1);
                imageView.setImageLevel(0);
                cnt=0;
            }
            if(cnt%5==1){
                ImageView imageView=(ImageView)findViewById(R.id.image_1);
                imageView.setImageLevel(1);
            }
            if(cnt%5==2){
                ImageView imageView=(ImageView)findViewById(R.id.image_1);
                imageView.setImageLevel(2);
            }
            if(cnt%5==3){
                ImageView imageView=(ImageView)findViewById(R.id.image_1);
                imageView.setImageLevel(3);
            }
            if(cnt%5==4){
                ImageView imageView=(ImageView)findViewById(R.id.image_1);
                imageView.setImageLevel(4);
            }
            cnt++;
            //Log.d("four_Activity","lllllllllllllllllllllllllllllll");
        }
    };

    @Override
    protected void onStart(){
        super.onStart();
        timer.schedule(task,0,1000);
    }
    @Override
    protected void onStop(){
        super.onStop();
        timer.cancel();
    }

}
