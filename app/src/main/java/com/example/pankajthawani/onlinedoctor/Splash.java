package com.example.pankajthawani.onlinedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    //Code to intent to move this from registration activity
                    Intent i =new Intent(Splash.this,Registration.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
