package com.example.dm4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Startscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);
    }
    public void onClickStartscr (View v){
        Intent intent2 = new Intent(Startscreen.this, navg.class);
        startActivity(intent2);

    }
}