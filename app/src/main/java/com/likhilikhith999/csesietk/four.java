package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class four extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        button = (Button)findViewById(R.id.fourone);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openfourone();
            }
        });

        button = (Button)findViewById(R.id.fourtwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfourtwo();
            }
        });

    }

    private void openfourtwo() {
        Toast.makeText(this, " 4th Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udfourtwo.class);
        startActivity(intent);
    }

    private void openfourone() {

        Toast.makeText(this, " 4th Year 1st Sem ", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this,udfourone.class);
        startActivity(intent);
    }
}
