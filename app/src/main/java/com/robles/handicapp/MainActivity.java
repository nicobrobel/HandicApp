package com.robles.handicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSickScn (View view){
        Intent intent = new Intent(this,SickScn.class);
        startActivity(intent);
    }
    public void callHospScn (View view){
        Intent intent = new Intent(this,HospScn.class);
        startActivity(intent);
    }
    public void callWhatToDo (View view){
        Intent intent = new Intent(this,WhatToDo.class);
        startActivity(intent);
    }
    public void callDrugStore (View view){
        Intent intent = new Intent(this,DrugStore.class);
        startActivity(intent);
    }
}
