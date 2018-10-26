package com.example.lenovo.myapplication1_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Toast.makeText(this,data.toString(),Toast.LENGTH_SHORT).show();
    }
}
