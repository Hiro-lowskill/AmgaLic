package com.example.hakaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn(View view){
        Intent i = new Intent(this,ReadActivity.class);
        startActivity(i);
    }

    public void btn2(View view){
        Intent i = new Intent(this,web_screen.class);
        startActivity(i);
    }

    public void btn3(View view){
        Intent i = new Intent(this,calendar.class);
        startActivity(i);
    }
}