package com.example.vooch.dogruz.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vooch.dogruz.R;

public class LoginActivity extends AppCompatActivity {

    private Button mEnterButton;
    private EditText mPhoneNumber;
    private EditText mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEnterButton=findViewById(R.id.enter_button);
        mPhoneNumber=findViewById(R.id.phone_number);
        mPassword=findViewById(R.id.password);



        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPhoneNumber.getText()==null & mPassword.getText() == null){

                }else {
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
