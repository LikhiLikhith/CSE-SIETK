package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class three extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        button = (Button)findViewById(R.id.threeone);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openthreeone();
            }
        });

        button = (Button)findViewById(R.id.threetwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthreetwo();
            }
        });

    }

    private void openthreetwo() {
        Toast.makeText(this, " 3rd Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udthreetwo.class);
        startActivity(intent);
    }

    private void openthreeone() {

        Toast.makeText(this, " 3rd Year 1st Sem ", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this,udthreeone.class);
        startActivity(intent);
    }
}
