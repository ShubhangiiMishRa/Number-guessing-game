package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNum;

    public void guessNum(View view){
        EditText guessedNum = (EditText)findViewById(R.id.number);
        int guessedNumber = Integer.parseInt(guessedNum.getText().toString());
        if(guessedNumber > randomNum){
            Toast.makeText(this, "Guess a smaller number", Toast.LENGTH_LONG).show();
        }
        else if(guessedNumber < randomNum){
            Toast.makeText(this, "Guess a bigger number", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Correct guess!!!!!!", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random num = new Random();
        randomNum = num.nextInt(20)+1;   // to guess a number in between 1 to 20
    }
}