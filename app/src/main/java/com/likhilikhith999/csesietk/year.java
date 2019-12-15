package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class year extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        button = (Button) findViewById(R.id.threeyear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThreesem();
            }
        });

        button = (Button) findViewById(R.id.oneyear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneyear();
            }
        });

        button = (Button) findViewById(R.id.twoyear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwoyear();
            }
        });

        button = (Button) findViewById(R.id.fouryear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFouryear();
            }
        });

    }

    private void openFouryear() {
        Toast.makeText(this, " 4th Year CSE ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,four.class);
        startActivity(intent);
    }

    private void openTwoyear() {
        Toast.makeText(this, " 2nd Year CSE ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,two.class);
        startActivity(intent);
    }

    private void openOneyear() {
        Toast.makeText(this, " 1st Year CSE ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,one.class);
        startActivity(intent);
    }

    private void openThreesem() {

        Toast.makeText(this, " 3rd Year CSE ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,three.class);
        startActivity(intent);

    }
}
