package com.example.employment;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String ed1;
    Double salary,days,spd,current;
    TextView tv1,tv2,tv3;
    EditText name,sal,numd;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        name=(EditText) findViewById(R.id.name);
        sal=(EditText) findViewById(R.id.sal);
        sal.setInputType(InputType.TYPE_CLASS_NUMBER);
        numd=(EditText) findViewById(R.id.numd);
        numd.setInputType((InputType.TYPE_CLASS_NUMBER));
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty()|| sal.getText().toString().isEmpty()|| numd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Fill all Fields",Toast.LENGTH_LONG).show();
                } else {
                    ed1=name.getText().toString();
                    salary=Double.parseDouble(sal.getText().toString());
                    days=Double.parseDouble(numd.getText().toString());
                    tv1.setText("Hello "+ed1+",");
                    spd=salary/30.0;
                    current=30.0-days;
                    String text = "     This Month Salary is "+(spd*current);
                    tv2.setText(text);
                    String text2 = "     Deducted Amount is"+(spd*days);
                    tv3.setText(text2);
                }
            }
        });
    }
}