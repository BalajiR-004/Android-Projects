package com.example.wizard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    EditText texb;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,clear,openb,closeb,division,multiply,minus,plus,equalto,modulo,dot;
    String num="",op;
    int f1,f2,sol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        texb=(EditText) findViewById(R.id.texb);
        b0=(Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"0";
                texb.setText(num);
            }
        });
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"1";
                texb.setText(num);
            }
        });
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"2";
                texb.setText(num);
            }
        });
        b3=(Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"3";
                texb.setText(num);
            }
        });
        b4=(Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"4";
                texb.setText(num);
            }
        });
        b5=(Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"5";
                texb.setText(num);
            }
        });
        b6=(Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"6";
                texb.setText(num);
            }
        });
        b7=(Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"7";
                texb.setText(num);
            }
        });
        b8=(Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"8";
                texb.setText(num);
            }
        });
        b9=(Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"9";
                texb.setText(num);
            }
        });
        clear=(Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texb.setText("");
                f1=0;
                f2=0;
                sol=0;
                num="";
            }
        });
        openb=(Button) findViewById(R.id.openb);
        openb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+"(";
                texb.setText(num);
            }
        });
        closeb=(Button) findViewById(R.id.closeb);
        closeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+")";
                texb.setText(num);
            }
        });
        division=(Button) findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="/";
                f1=Integer.parseInt(texb.getText().toString());
                texb.setText("");
                num="";
            }
        });
        multiply=(Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="X";
                f1=Integer.parseInt(texb.getText().toString());
                texb.setText("");
                num="";
            }
        });
        minus=(Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="-";
                f1=Integer.parseInt(texb.getText().toString());
                texb.setText("");
                num="";
            }
        });
        plus=(Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="+";
                f1=Integer.parseInt(texb.getText().toString()) ;
                texb.setText("");
                num="";
            }
        });
        equalto=(Button) findViewById(R.id.equalto);
        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2=Integer.parseInt(texb.getText().toString());
                switch (op){
                    case "+":
                        sol=f1+f2;
                        texb.setText(""+sol);
                        break;
                    case "-":
                        sol=f1-f2;
                        texb.setText(""+sol);
                        break;
                    case "X":
                        sol=f1*f2;
                        texb.setText(""+sol);
                        break;
                    case "/":
                        sol=f1/f2;
                        texb.setText(""+sol);
                        break;
                    case "%":
                        sol=f1%f2;
                        texb.setText(""+sol);
                        break;
                }
            }
        });
        modulo=(Button) findViewById(R.id.modulo);
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="%";
                f1=Integer.parseInt(texb.getText().toString());
                texb.setText("");
                num="";
            }
        });
        dot=(Button) findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=num+".";
                texb.setText(num);
            }
        });
    }
}