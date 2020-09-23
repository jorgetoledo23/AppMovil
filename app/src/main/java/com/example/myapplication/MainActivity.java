package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("INFOCICLO", "Actividad en ciclo onCreate");

        Button btnSaludo2 = findViewById(R.id.btnSaludo2);
        btnSaludo2.setOnClickListener(view -> {
            Toast.makeText(this, "Click en el Boton Saludo 2", Toast.LENGTH_SHORT).show();
        });

        TextView tvSaludo3 = findViewById(R.id.tvSaludo3);
        tvSaludo3.setOnClickListener(this);

        Button btnSaludo4 = findViewById(R.id.btnSaludo4);
        btnSaludo4.setOnClickListener(this);

        Button btnSnackBar = findViewById(R.id.btnSnackBar);
        btnSnackBar.setOnClickListener(view -> {
            Snackbar.make(view, "SnackBar Ejemplo", Snackbar.LENGTH_LONG).show();
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("INFOCICLO", "Actividad en ciclo onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFOCICLO", "Actividad en ciclo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFOCICLO", "Actividad en ciclo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFOCICLO", "Actividad en ciclo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFOCICLO", "Actividad en ciclo onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFOCICLO", "Actividad en ciclo onStop");
    }

    public void btnSaludoOnClick(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Bienvenidos";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(this, "Bienvenido desde el tv Saludo 3", Toast.LENGTH_SHORT).show();
    }
}