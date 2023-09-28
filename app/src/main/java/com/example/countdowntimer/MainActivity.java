package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contar;

        contar=findViewById(R.id.txtTiempo);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                contar.setText("Segundos: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                LlamarPantalla();
            }
        }.start();
    }

    private void LlamarPantalla()
    {
        Intent i=new Intent(this, actividad2.class);
        startActivity(i);
    }
}