package com.bcepnez.nearbydormitory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgb1 = (ImageButton)findViewById(R.id.Button1);
        Button b1= (Button)findViewById(R.id.text1);
        imgb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(I);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(I);
            }
        });

        ImageButton imgb2 = (ImageButton)findViewById(R.id.Button2);
        Button b2 = (Button)findViewById(R.id.text2);
        imgb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,allDormitory.class);
                startActivity(I);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,allDormitory.class);
                startActivity(I);
            }
        });

        ImageButton imgb3 = (ImageButton)findViewById(R.id.Button3);
        Button b3 = (Button)findViewById(R.id.text3);
        imgb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,allDormitory.class);
                startActivity(I);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,allDormitory.class);
                startActivity(I);
            }
        });

        Button gg = (Button)findViewById(R.id.adddorm);
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,Login.class);
                startActivity(I);
            }
        });

    }


}
