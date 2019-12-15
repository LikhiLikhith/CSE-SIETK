package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class admyears extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admyears);

        button = (Button) findViewById(R.id.oneone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneOne();
            }
        });

        button = (Button) findViewById(R.id.onetwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTwo();
            }
        });

        button = (Button) findViewById(R.id.twoone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwoOne();
            }
        });

        button = (Button) findViewById(R.id.twotwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwoTwo();
            }
        });

        button = (Button) findViewById(R.id.threeone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThreeOne();
            }
        });

        button = (Button) findViewById(R.id.threetwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThreeTwo();
            }
        });

        button = (Button) findViewById(R.id.fourone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFourOne();
            }
        });

        button = (Button) findViewById(R.id.fourtwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFourTwo();
            }
        });

        button = (Button) findViewById(R.id.info);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });

    }

    private void openOneOne() {
        Toast.makeText(this, " 1st Year 1st Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udoneone.class);
        startActivity(intent);
    }

    private void openOneTwo() {
        Toast.makeText(this, " 1st Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udonetwo.class);
        startActivity(intent);
    }

    private void openTwoOne() {
        Toast.makeText(this, " 2nd Year 1st Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udtwoone.class);
        startActivity(intent);
    }

    private void openTwoTwo() {

        Toast.makeText(this, " 2nd Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udtwotwo.class);
        startActivity(intent);

    }

    private void openThreeOne() {
        Toast.makeText(this, " 3rd Year 1st Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udthreeone.class);
        startActivity(intent);
    }

    private void openThreeTwo() {
        Toast.makeText(this, " 3rd Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udthreetwo.class);
        startActivity(intent);
    }

    private void openFourOne() {
        Toast.makeText(this, " 4th Year 1st Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udfourone.class);
        startActivity(intent);
    }

    private void openFourTwo() {

        Toast.makeText(this, " 4th Year 2nd Sem ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,udfourtwo.class);
        startActivity(intent);

    }

    private void openInfo() {

        Toast.makeText(this, " Notice Board ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,Upanddown.class);
        startActivity(intent);

    }
}
