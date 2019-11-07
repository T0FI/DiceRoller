package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click(View view) {

        roll_the_Dice();

        TextView tv = this.findViewById(R.id.numberTextView);
        TextView en = (TextView) this.findViewById(R.id.EnterNumber);
        TextView si = (TextView) this.findViewById(R.id.ScoreId);


        int Number = Integer.valueOf(tv.getText().toString());
        int UserNumber = Integer.valueOf(en.getText().toString());

        if (UserNumber == Number) {
            int Score = Integer.valueOf(si.getText().toString());
            int ScoreChecker = Score + 1;

            si.setText(Integer.toString(ScoreChecker));

            Toast.makeText(getApplicationContext(), "You guessed the same number, congratulations!", Toast.LENGTH_SHORT).show();


        }
    }

    public void on_button2_click(View view) {

        roll_the_Dice();

        TextView gb = this.findViewById(R.id.Question_box);
        TextView tv = this.findViewById(R.id.numberTextView);

        int number = Integer.valueOf(tv.getText().toString());

        if (number == 1){
            gb.setText("If you could go anywhere in the world, where would you go?");
        }
        else if (number == 2) {
            gb.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }
        else if (number == 3) {
            gb.setText("If you could eat only one food for the rest of your life, what would that be?");
        }
        else if (number == 4) {
            gb.setText("If you won a million dollars, what is the first thing you would buy?");
        }
        else if (number == 5) {
            gb.setText("If you could spend the day with one fictional character, who would it be?");
        }
        else if (number == 6) {
            gb.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }
    }


    public void roll_the_Dice(){

        TextView tv = this.findViewById(R.id.numberTextView);

        Random r = new Random();
        int number = r.nextInt(6);


        tv.setText(Integer.toString(number));

    }
}


