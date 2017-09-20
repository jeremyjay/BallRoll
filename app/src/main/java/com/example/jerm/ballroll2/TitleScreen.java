package com.example.jerm.ballroll2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    /** Called when the user taps the Play button */
    public void Play(View view) {
        // Do something in response to button
        Intent intent = new Intent(TitleScreen.this, Play.class);
        intent.putExtra("EXIT", false);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    /** Called when the user taps the Credits button */
    public void Credits(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }

}
