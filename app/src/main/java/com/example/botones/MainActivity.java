package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.example.botones.R.color.btnInicio;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.btnInicio);
        myButton.setText(R.string.btnInicio);
        myButton.setBackgroundColor(Color.parseColor(getString(R.color.btnInicio)));
    }

    public void btnInicioClick(View view) {

        Button myButton = (Button) findViewById(R.id.btnInicio);
        RelativeLayout myActivity = (RelativeLayout) findViewById(R.id.Actividad_Principal);

        String texto = myButton.getText().toString();

        myActivity.setBackgroundColor(Color.parseColor("#ff00ff"));

        Toast.makeText(this, "Has pulsado el botón con el texto: " +texto, Toast.LENGTH_LONG).show();
    }
}