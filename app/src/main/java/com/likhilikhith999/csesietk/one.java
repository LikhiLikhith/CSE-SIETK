package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class one extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        button = (Button)findViewById(R.id.oneone);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openoneone();
            }
        });

        button = (Button)findViewById(R.id.onetwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openonetwo();
            }
        });

    }

    private void openonetwo() {
        Toast.makeText(this, " 1st Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udonetwo.class);
        startActivity(intent);
    }

    private void openoneone() {

        Toast.makeText(this, " 1st Year 1st Sem ", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this,udoneone.class);
        startActivity(intent);
    }
}
