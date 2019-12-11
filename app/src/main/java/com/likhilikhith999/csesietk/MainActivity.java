package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYear();
            }
        });

    }

    public void openYear(){

        Toast.makeText(this, " Welcome to CSE_SIETK ", Toast.LENGTH_SHORT).show();

        Intent intent= new Intent(this,Login.class);
        startActivity(intent);

    }

}
