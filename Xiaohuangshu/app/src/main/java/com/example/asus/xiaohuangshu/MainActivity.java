package com.example.asus.xiaohuangshu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        login = (Button)findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,B.class);
                startActivity(intent);
            }
        });

    }
}
