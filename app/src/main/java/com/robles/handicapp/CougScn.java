package com.robles.handicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CougScn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coug_scn);
    }
    public void callMainScn (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
