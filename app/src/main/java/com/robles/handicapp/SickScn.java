package com.robles.handicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SickScn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sick_scn);
    }
    public void callMainScn (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void callFeveScn (View view){
        Intent intent = new Intent(this,FeverScn.class);
        startActivity(intent);
    }
    public void callFluScn (View view){
        Intent intent = new Intent(this,FluScn.class);
        startActivity(intent);
    }
    public void callCougScn (View view){
        Intent intent = new Intent(this,CougScn.class);
        startActivity(intent);
    }
    public void callColdScn (View view){
        Intent intent = new Intent(this,ColdScn.class);
        startActivity(intent);
    }
}
