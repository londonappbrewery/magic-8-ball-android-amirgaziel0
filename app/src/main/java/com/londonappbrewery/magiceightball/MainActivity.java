package com.londonappbrewery.magiceightball;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Ask_Button;

        Ask_Button= (Button) findViewById(R.id.Ask_Button);

       final ImageView ballDispaly = (ImageView) findViewById(R.id.image_eightBall);

         final int [] ballArry ={

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };



        Ask_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomAsk = new Random();

                int number = randomAsk.nextInt(5);

                ballDispaly.setImageResource(ballArry[number]);

            }
        });






    }
}
