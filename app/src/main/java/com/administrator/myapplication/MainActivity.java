package com.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Alt+Enter
    public void showInfo(View view) {
        Toast.makeText(MainActivity.this,"666",Toast.LENGTH_LONG).show();
    }


}
