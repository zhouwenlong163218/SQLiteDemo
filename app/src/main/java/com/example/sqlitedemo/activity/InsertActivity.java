package com.example.sqlitedemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sqlitedemo.R;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSure.findViewById(R.id.btn_sure);
        btnSure.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
