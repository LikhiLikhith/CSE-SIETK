package com.likhilikhith999.csesietk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Verify();

    }



    public void loginMethod(View view) {

        if (user.getText().toString().equals("ADMIN") && pass.getText().toString().equals("BHIDEN@008"))
        {
            Toast.makeText(getApplicationContext(), "Hello Boss.....Welcome Back....!!!!", Toast.LENGTH_LONG).show();

            Intent intent= new Intent(this,admyears.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Please Enter Valid Username & Password.....!!!", Toast.LENGTH_SHORT).show();

        }
        if (user.getText().toString().equals("STUDENT") && pass.getText().toString().equals("Cse@123"))
        {
            Toast.makeText(getApplicationContext(), "Login Successfull....Enjoy Privileges...!!!", Toast.LENGTH_SHORT).show();

            Intent intent= new Intent(this,year.class);
            startActivity(intent);
        }

    }
    private void Verify()
    {

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.login);

    }
}
