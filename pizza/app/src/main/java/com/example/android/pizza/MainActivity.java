package com.example.android.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     TextView signup; // user after fill require filled press containue and go to the second activity
   EditText mobileNumber; //get mobile number from user
     EditText password; //get password from user
    EditText email; //get email from user
     EditText passValidate; //make sure the password match
    final public static String ENTERED_EMAIL = "email";
    final public static String ENTERED_PASSWORD = "password";
    final public static String ENTERED_MOBILE = "mobile number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signup = (TextView) findViewById(R.id.cont);
        mobileNumber = (EditText) findViewById(R.id.mobile);
        password = (EditText) findViewById(R.id.pass);
        email = (EditText)findViewById(R.id.email);
passValidate = (EditText)  findViewById(R.id.passValidation);



        signup.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                String mobile = mobileNumber.getText().toString();
                String pass = password.getText().toString();
                String Email = email.getText().toString();
                i.putExtra(ENTERED_MOBILE, mobile);
                i.putExtra(ENTERED_PASSWORD, pass);
                i.putExtra(ENTERED_EMAIL, Email);
                startActivity(i);}






        });

        /**
         * This method is called when the plus button is clicked.
         */


    }
}
;