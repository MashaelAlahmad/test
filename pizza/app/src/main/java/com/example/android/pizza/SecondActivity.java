package com.example.android.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView Result;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i =getIntent();
        String information = i.getExtras().getString(MainActivity.ENTERED_EMAIL);
        Result = (TextView) findViewById(R.id.result);
        String message ="welcome to you in my app \n your email is "+information ;
        information =i.getExtras().getString(MainActivity.ENTERED_PASSWORD);
        message += "\n and your password is "+ information;
        information =i.getExtras().getString(MainActivity.ENTERED_MOBILE);
        message += "\n and your mobile is "+information;
Result.setText(message);
    }
}
