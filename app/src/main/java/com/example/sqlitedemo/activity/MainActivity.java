package com.example.sqlitedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.sqlitedemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int ADD_REQUEST =10 ;
    private static final int MODIFY_REQUEST = 10;
    private ListView listView;
  private Button btnAdd,btnModify,btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btnAdd.findViewById(R.id.btn_add);
       btnModify.findViewById(R.id.btn_modify);
       btnDelete.findViewById(R.id.btn_delete);
       btnAdd.setOnClickListener(this );
       btnDelete.setOnClickListener(this);
       btnModify.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
                  switch (v.getId()){
                      case R.id.btn_add:
                          Intent intent = new Intent(MainActivity.this,InsertActivity.class);
                          startActivityForResult(intent,ADD_REQUEST);
                          break;
                      case R.id.btn_modify :
                          Intent intent1 = new Intent(MainActivity.this,Insert2Activity.class);
                          Bundle bundle = new Bundle();
                          startActivityForResult(intent1,MODIFY_REQUEST);
                          break;
                      case R.id.btn_delete:

                  }
    }
}
