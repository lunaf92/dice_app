package com.semantics.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftdice = findViewById(R.id.left_dice);

        final ImageView rightdice = findViewById(R.id.right_dice);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4,
                R.drawable.dice5, R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("dicee", "ok");

                Random randomNumberGen = new Random();

                int num = randomNumberGen.nextInt(6);
                Log.d("dicee", "the random number is "+num);

                int num2 = randomNumberGen.nextInt(6);

                leftdice.setImageResource(diceArray[num]);
                rightdice.setImageResource(diceArray[num2]);
            }
        });
    }
}
