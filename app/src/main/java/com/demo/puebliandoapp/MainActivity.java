package com.demo.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //atributos=elementos de la actividad
    MediaPlayer sonido;

    //metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonido=MediaPlayer.create(this,R.raw.audioapp);
        sonido.start();

        //temporizamos el splash

        TimerTask inicioApp=new TimerTask() {
            @Override
            public void run() {
                //lanzo el home
                Intent lanzamiento=new Intent(MainActivity.this,Home.class);
                startActivity(lanzamiento);
            }
        };

        Timer tiempo=new Timer();
        tiempo.schedule(inicioApp,10000);
    }
}