package com.example.diceless;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean checkedSoundOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Intent i = getIntent();
        soundOn = i.getBooleanExtra("soundOn", true);
        Log.d("SOUND ON MAIN", String.valueOf(soundOn));
        */
        CheckBox soundOn = (CheckBox) findViewById(R.id.soundOn);
        checkedSoundOn = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("soundOn", false);
        soundOn.setChecked(checkedSoundOn);
    }

    public void disableButton(View v) {
        /*
        TextView text = findViewById(R.id.helloWolrd);
        if(v.getId() == R.id.button2) {
            text.setText("CALE");
            Log.d("set text", "set text to CALE");
        }

         */
    }

    public void handleText (View v){
        /*
        EditText textInput = findViewById(R.id.personName);
        String input = textInput.getText().toString();
        TextView textOutput = findViewById(R.id.helloWolrd);
        textOutput.setText(input);
        Log.d("set output", "set output " + input);
        Toast.makeText(this, "Name " + input, Toast.LENGTH_SHORT).show();
        */
    }

    public void launchSettings(View v) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    public void launchRollPage(View v) {
        Intent i = new Intent(this, RollActivity.class);
        Log.d("SOUND ON ROLL", String.valueOf(checkedSoundOn));
        i.putExtra("soundOn", checkedSoundOn);
        startActivity(i);
    }

}