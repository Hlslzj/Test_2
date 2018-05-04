package com.example.kingdom.myapplication_1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class four_Activity extends AppCompatActivity {
    final static int UPDATE_IMAGEVIEW = 1;
    Timer timer = new Timer();
    int cnt = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case UPDATE_IMAGEVIEW:
                    if (cnt % 5 == 0) {
                        ImageView imageView = (ImageView) findViewById(R.id.image_1);
                        imageView.setImageLevel(0);
                    }
                    if (cnt % 5 == 1) {
                        ImageView imageView = (ImageView) findViewById(R.id.image_1);
                        imageView.setImageLevel(1);
                    }
                    if (cnt % 5 == 2) {
                        ImageView imageView = (ImageView) findViewById(R.id.image_1);
                        imageView.setImageLevel(2);
                    }
                    if (cnt % 5 == 3) {
                        ImageView imageView = (ImageView) findViewById(R.id.image_1);
                        imageView.setImageLevel(3);
                    }
                    if (cnt % 5 == 4) {
                        ImageView imageView = (ImageView) findViewById(R.id.image_1);
                        imageView.setImageLevel(4);
                    }
                    cnt++;
                    break;
                default:
                    break;
            }
        }

    };
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Message message = new Message();
            message.what = UPDATE_IMAGEVIEW;
            handler.sendMessage(message);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_);
        Button button_1 = (Button) findViewById(R.id.button_1);
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
        new Thread(new Runnable() {
            @Override
            public void run() {
                timer.schedule(task, 0, 1000);
            }
        }).start();

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        timer.cancel();
    }

}
