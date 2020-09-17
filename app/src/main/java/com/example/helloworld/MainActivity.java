package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button b;
    EditText E;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.helButton);
        E = (EditText)findViewById(R.id.perName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                sendData(s);
            }
        });

    }

    private void sendData(String s) {
        Intent intent = new Intent(this , HelloActivity.class);
        intent.putExtra(name "perName" , s);
        startActivity(intent);
    }
}