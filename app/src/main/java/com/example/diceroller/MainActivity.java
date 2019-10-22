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

        TextView tv = this.findViewById(R.id.numberTextView) ;
        TextView en = (TextView) this.findViewById(R.id.EnterNumber);
        TextView ms = this.findViewById(R.id.Message);

        Random r = new Random();
        int number = r.nextInt (6);


        tv.setText(Integer.toString(number));


        int Number = Integer.valueOf(tv.getText().toString());
        int UserNumber = Integer.valueOf(en.getText().toString());

        if (UserNumber == Number) {
            Toast.makeText(getApplicationContext(), "You guessed the same number, congratulations!", Toast.LENGTH_SHORT).show();
        }
    }
}
