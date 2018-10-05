package com.example.amikom.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonactivity, buttonfragmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonactivity = (Button) findViewById(R.id.btn_activity);
        buttonfragmen = (Button) findViewById(R.id.btn_frag);

        buttonactivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Secondactivity.class);
                startActivity(intent);
            }
        });
    }

}