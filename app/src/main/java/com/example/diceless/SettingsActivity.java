package com.example.diceless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import androidx.preference.Preference;
import androidx.preference.PreferenceManager;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class SettingsActivity extends AppCompatActivity {

    private boolean setSoundOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void setSoundOn(View v) {
        Log.d("SET SOUND ON", "SET SOUND ON");
        CheckBox soundOn = findViewById(R.id.soundOn);
        setSoundOn = soundOn.isChecked();
        Log.d("SOUND ON", String.valueOf(setSoundOn));
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.soundOn:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("soundOn", checked).commit();
                break;
        }
    }

    public void done(View v) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("soundOn", setSoundOn);
        Log.d("SOUND ON DONE", String.valueOf(setSoundOn));
        startActivity(i);
    }
}