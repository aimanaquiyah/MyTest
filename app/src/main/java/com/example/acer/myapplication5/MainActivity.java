package com.example.acer.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Array of options --> ArrayAdapter -->  ListView

public class    MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //secondpage sama dengan dkat activity_main.xml
    public void secondpage(View view) {

        Intent intent = new Intent(this, SecondPage.class); //SecondPage sama denagan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }
}

