package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class threetwoo extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threetwoo);

        button = (Button)findViewById(R.id.unix);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openunix();

            }
        });

        button = (Button)findViewById(R.id.flat);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openflat();

            }
        });

        button = (Button)findViewById(R.id.sea);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                opensea();

            }
        });

        button = (Button)findViewById(R.id.wt);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openwt();

            }
        });

        button = (Button)findViewById(R.id.bd);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openbd();

            }
        });

        button = (Button)findViewById(R.id.daa);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                opendaa();

            }
        });

        button = (Button)findViewById(R.id.other);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openother();

            }
        });


    }

    private void openother() {

        Toast.makeText(this, "Others", Toast.LENGTH_SHORT).show();

    }

    private void opendaa() {

        Toast.makeText(this, "DAA", Toast.LENGTH_SHORT).show();

    }

    private void openbd() {

        Toast.makeText(this, "Big Data", Toast.LENGTH_SHORT).show();
    }

    private void openwt() {

        Toast.makeText(this, "Web Technology", Toast.LENGTH_SHORT).show();
    }

    private void opensea() {

        Toast.makeText(this, "SEA", Toast.LENGTH_SHORT).show();
    }

    private void openflat() {

        Toast.makeText(this, "FLAT", Toast.LENGTH_SHORT).show();

    }

    private void openunix() {

        Toast.makeText(this, "Unix & Shell", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,ViewUploadsActivity.class);
        startActivity(intent);

    }
}
