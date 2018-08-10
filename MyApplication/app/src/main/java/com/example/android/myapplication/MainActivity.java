package com.example.android.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Check(View view) {
        EditText text=(EditText)findViewById(R.id.editText) ;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("ل فعلا تريد حذف النص ");
        builder.setIcon(android.R.drawable.stat_notify_error);
        builder.setTitle("تاكيد حذف النص");
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}
