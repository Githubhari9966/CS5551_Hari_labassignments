package com.example.veliv.labassignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText un = (EditText) findViewById(R.id.un);
        final EditText pwd = (EditText) findViewById(R.id.pwd);
        final Button LOGIN = (Button) findViewById(R.id.LOGIN);
        final Button reg1 = (Button) findViewById(R.id.reg1);

        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(signupIntent);

            }
        });
    }
}
