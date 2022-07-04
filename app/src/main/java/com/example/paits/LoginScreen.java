package com.example.paits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewRegistrationPIATS();
            }
        });

//        initializeViews();
//        listeners();
    }

    private void openNewRegistrationPIATS() {
        Intent intent = new Intent(this, NewRegistrationPIATS.class);
        startActivity(intent);
    }


    }



