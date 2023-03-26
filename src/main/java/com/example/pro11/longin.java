package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class longin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin);
    }
    public void pr3(View v){
        EditText tx=(EditText)findViewById(R.id.editTextTextPersonName);

        Intent go=new Intent(getApplicationContext(),pro3.class);
        go.putExtra("username",tx.getText().toString());
        startActivity(go);
    }

}