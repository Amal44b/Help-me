package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void TraineeorCoach(View view){


        Intent go=new Intent(this,Longdr.class);
        startActivity(go);


    }
    public void Thedoctors(View view){


        Intent go=new Intent(this,pro3.class);
        startActivity(go);

    }
    public void Vistor(View v){
        Intent go=new Intent(this,pro3.class);
        startActivity(go);
    }


}