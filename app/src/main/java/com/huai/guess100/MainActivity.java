package com.huai.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }
    public void findViews(){
        TextView info = (TextView) findViewById(R.id.info);
        TextView secret = (TextView) findViewById(R.id.secret);
        EditText number = (EditText) findViewById(R.id.number);
        Button send = (Button) findViewById(R.id.send);
    }
}
