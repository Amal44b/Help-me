package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pro3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro3);
    }
    public void log(View v){
        Intent go=new Intent(this,MainActivity.class);
        startActivity(go);
    }
}