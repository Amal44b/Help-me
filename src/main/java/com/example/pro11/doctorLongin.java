package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;

public class doctorLongin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_longin);
    }
    public void pr33(View v){
        EditText tt=(EditText)findViewById(R.id.editTextTextPersonName2);

        Intent goo=new Intent(getApplicationContext(),pro3.class);
        goo.putExtra("username",tt.getText().toString());
        startActivity(goo);
    }

}