package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class Longdr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longdr);
        TextView Text1 = (TextView) findViewById(R.id.tex3);
        ////سطر الربط بid الخاص بعنصر TextView بملف XML
        EditText Academic = (EditText) findViewById(R.id.edi3);
        ////سطر الربط بid الخاص بعنصر EditText بملف XML
        TextView Text2 = (TextView) findViewById(R.id.tex4);
        ////سطر الربط بid الخاص بعنصر TextView بملف XML
        EditText passw = (EditText) findViewById(R.id.edi4);
        ////سطر الربط بid الخاص بعنصر EditText بملف XML
        Button b1 = (Button) findViewById(R.id.log2);
        ////سطر الربط بid الخاص بعنصر Button بملف XML


        b1.setOnClickListener(new View.OnClickListener() {
            ////استماع للزر مجرد المستخدم الضغط على الزر
            @Override
            public void onClick(View view) {


                String Academic2 = Academic.getText().toString();
                // //من خلال Academic راح يأخد المعلومه ويحولها للنص ويضع النص في Academic2 من نوع String

                String passw2 = passw.getText().toString();
                // //من خلال passw راح يأخد المعلومه ويحولها للنص ويضع النص في pas من نوع String

                if (Academic2.equals("") && passw2.equals("")) {
                    ////اذا كان فاضي حطيت له شرط أن لازم يعبي هالحقل ولا راح يجي error
                    Academic.setError("Empty Academic Number !");
                    // //وضعت setError بالتالي يجب تعبئة الحقل Academic واذا لم يتم كتابة داخل الحقل راح يطلع لي error
                    passw.setError("Empty Password !");
                    // //وضعت setError بالتالي يجب تعبئة الحقل passw واذا لم يتم كتابة داخل الحقل راح يطلع لي error

                } else {

                    if (!Academic2.equals("") && passw2.equals("")) {
                        ////اذا كان الرقم الأكاديمي لا يساوي فراغ
                        passw.setError("Empty Password !");
                    } else {
                        if (Academic2.equals("") && !passw2.equals("")) {
                            ////اذا كان الباسورود لا يساوي فراغ
                            Academic.setError("Empty Academic Number !");
                        }
                    }
                }


            }
        });

    }

    public void showMessage(String msg) {

        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        //showMessage("تم التسجيل بنجاح");
    }


    public void log(View v) {
        Intent go = new Intent(this, proo3. class);
        startActivity(go);
    }


}