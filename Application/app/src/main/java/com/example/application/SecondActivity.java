package com.example.application;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    TextView tv1,tv2;
    Button b1;
    RelativeLayout one,two,three,four,five,six,seven,eight,nine;
    String startX="x";
    int x_count=0,o_count=0,i=0,n1=5,n2=5,n3=5,n4=5,n5=5,n6=5,n7=5,n8=5,n9=5;
    public void winning(){
        if ((n1==1 && n2==1 && n3==1)||(n4==1 && n5==1 && n6==1)||(n7==1 && n8==1 && n9==1)||(n1==1 && n4==1 && n7==1)||(n2==1 && n5==1 && n8==1)||(n3==1 && n6==1 && n9==1)||(n1==1 && n5==1 && n9==1)||(n3==1 && n5==1 && n7==1)){
            Toast.makeText(getApplicationContext(),"' X ' Player Won the Match",Toast.LENGTH_LONG).show();
            x_count +=1;
            tv1.setText("X_Player Score : "+ x_count);
            freeze();
        } else if ((n1==0 && n2==0 && n3==0)||(n4==0 && n5==0 && n6==0)||(n7==0 && n8==0 && n9==0)||(n1==0 && n4==0 && n7==0)||(n2==0 && n5==0 && n8==0)||(n3==0 && n6==0 && n9==0)||(n1==0 && n5==0 && n9==0)||(n3==0 && n5==0 && n7==0)) {
            Toast.makeText(getApplicationContext(),"' O ' Player Won the Match",Toast.LENGTH_LONG).show();
            o_count +=1;
            tv2.setText("Y_Player Score : "+ o_count);
            freeze();
        } else if (i==8) {
            Toast.makeText(getApplicationContext()," Match Draw ",Toast.LENGTH_LONG).show();
        }
    }
    public void freeze(){
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
    }
    public void players(){
        if (startX.equals("x")){
            startX="o";
        }else {
            startX="x";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setBackgroundColor(Color.TRANSPARENT);
                two.setBackgroundColor(Color.TRANSPARENT);
                three.setBackgroundColor(Color.TRANSPARENT);
                four.setBackgroundColor(Color.TRANSPARENT);
                five.setBackgroundColor(Color.TRANSPARENT);
                six.setBackgroundColor(Color.TRANSPARENT);
                seven.setBackgroundColor(Color.TRANSPARENT);
                eight.setBackgroundColor(Color.TRANSPARENT);
                nine.setBackgroundColor(Color.TRANSPARENT);
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);
                i=0;
                n1=5;n2=5;n3=5;n4=5;n5=5;n6=5;n7=5;n8=5;n9=5;
            }
        });
        one=(RelativeLayout) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    one.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n1=1;
                }else {
                    one.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n1=0;
                }
            players();
                winning();
                i+=1;
                one.setEnabled(false);
            }
        });
        two=(RelativeLayout) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    two.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n2=1;
                }else {
                    two.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n2=0;
                }
                players();
                winning();
                i+=1;
                two.setEnabled(false);
            }
        });
        three=(RelativeLayout) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    three.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n3=1;
                }else {
                    three.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n3=0;
                }
                players();
                winning();
                i+=1;
                three.setEnabled(false);
            }
        });
        four=(RelativeLayout) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    four.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n4=1;
                }else {
                    four.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n4=0;
                }
                players();
                winning();
                i+=1;
                four.setEnabled(false);
            }
        });
        five=(RelativeLayout) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    five.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n5=1;
                }else {
                    five.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n5=0;
                }
                players();
                winning();
                i+=1;
                five.setEnabled(false);
            }
        });
        six=(RelativeLayout) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    six.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n6=1;
                }else {
                    six.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n6=0;
                }
                players();
                winning();
                i+=1;
                six.setEnabled(false);
            }
        });
        seven=(RelativeLayout) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    seven.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n7=1;
                }else {
                    seven.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n7=0;
                }
                players();
                winning();
                i+=1;
                seven.setEnabled(false);
            }
        });
        eight=(RelativeLayout) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    eight.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n8=1;
                }else {
                    eight.setBackground(getResources().getDrawable(R.drawable.o_player));
                    n8=0;
                }
                players();
                winning();
                i+=1;
                eight.setEnabled(false);
            }
        });
        nine=(RelativeLayout) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startX.equals("x")){
                    nine.setBackground(getResources().getDrawable(R.drawable.x_player));
                    n9=1;
                }else {
                    nine.setBackground(getResources().getDrawable(R.drawable.o_player));

                    n9=0;
                }
                players();
                winning();
                i+=1;
                nine.setEnabled(false);
            }
        });
    }
}