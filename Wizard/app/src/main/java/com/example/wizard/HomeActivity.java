package com.example.wizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    EditText uname,pass;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        uname=(EditText)findViewById(R.id.uname);
        pass=findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
              if (uname.getText().toString().isEmpty()|| pass.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(),"Fill all Fields",Toast.LENGTH_LONG).show();
              }
              else if (uname.getText().toString().equals("Wizard")&& pass.getText().toString().equals("12345")){
                Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
                Intent i =new Intent(HomeActivity.this,SecondActivity.class);
                startActivity(i);
              }
              else {
                  Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();
              }
            }
        });
    }
}