package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;




import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(view -> {
            TextView textView1 =  findViewById(R.id.text1);
            TextView textView2 =  findViewById(R.id.text2);
            textView1.setText(Integer.toString(getRandomNumber1(1,6)));
            textView2.setText(Integer.toString(getRandomNumber2(1,6)));
        });
    }
    public int getRandomNumber1(int min, int max) {
        return new Random().nextInt(max-min) + min;
    }

    public int getRandomNumber2(int min,int max){
        return new Random().nextInt(max-min) + min;
    }
}