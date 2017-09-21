package com.example.veliv.labassignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText un = (EditText) findViewById(R.id.un);
        final EditText pwd = (EditText) findViewById(R.id.pwd);
        final EditText cpwd = (EditText) findViewById(R.id.cpwd);
        final Button reg = (Button) findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent signupIntent = new Intent(Main2Activity.this, MainActivity.class);
                Main2Activity.this.startActivity(signupIntent);

            }
        });
    }
}
