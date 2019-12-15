package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class two extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = (Button)findViewById(R.id.twoone);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opentwoone();
            }
        });

        button = (Button)findViewById(R.id.twotwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentwotwo();
            }
        });

    }

    private void opentwotwo() {
        Toast.makeText(this, " 2nd Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udtwotwo.class);
        startActivity(intent);
    }

    private void opentwoone() {

        Toast.makeText(this, " 2nd Year 1st Sem ", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this,udtwoone.class);
        startActivity(intent);
    }
}

