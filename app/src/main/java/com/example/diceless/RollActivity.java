package com.example.diceless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class RollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        Intent i = getIntent();
        boolean soundOn = i.getBooleanExtra("soundOn", true);
        TextView view = findViewById(R.id.textView3);
        view.setText(String.valueOf(soundOn));
    }

    public void generateD4Result(View v) {
        EditText d4Result = findViewById(R.id.D4Result);
        int d4 = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        d4Result.setText(String.valueOf(d4));

    }

    public void generateD6Result(View v) {
        EditText d6Result = findViewById(R.id.D6Result);
        int d6 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        d6Result.setText(String.valueOf(d6));

    }

    public void generateD8Result(View v) {
        EditText d8Result = findViewById(R.id.D8Result);
        int d8 = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        d8Result.setText(String.valueOf(d8));

    }

    public void generateD10Result(View v) {
        EditText d10Result = findViewById(R.id.D10Result);
        int d10 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        d10Result.setText(String.valueOf(d10));

    }

    public void generateD12Result(View v) {
        EditText d12Result = findViewById(R.id.D12Result);
        int d12 = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        d12Result.setText(String.valueOf(d12));

    }

    public void generateD20Result(View v) {
        EditText d20Result = findViewById(R.id.D20Result);
        int d20 = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        d20Result.setText(String.valueOf(d20));

    }

    public void generateD100Result(View v) {
        EditText d100Result = findViewById(R.id.D100Result);
        int d100 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        d100Result.setText(String.valueOf(d100));

    }

}