package com.huai.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int n = r.nextInt(100)+1;
    int min = 0;
    int max = 100;
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
        int sec = Integer.parseInt(secret.getText().toString());
        int num = Integer.parseInt(number.getText().toString());


        secret.setText(Integer.toString(n));

        if (num > sec){
            max = num;
            new AlertDialog.Builder(this)
                    .setMessage(min+"to"+max)
                    .setPositiveButton("OK", null)
                    .show();
        }else if (num < sec){
            min = num;
            new AlertDialog.Builder(this)
                    .setMessage(min+"to"+max)
                    .setPositiveButton("OK", null)
                    .show();
        }



    }
}
