package com.example.dm4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onClickPass(View v){
        EditText pas1 = (EditText)findViewById(R.id.pass);
        EditText pas2 = (EditText)findViewById(R.id.pass2);


        if(pas1.getText().toString().equals( pas2.getText().toString())){
            Toast.makeText(this, "Пароли совпадают", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show();
        }

    }
}