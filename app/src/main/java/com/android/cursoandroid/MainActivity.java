package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txvEstado;
    private String ciclo_vida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CLASEANDORID", "ONCREATE");

        txvEstado = (TextView)findViewById(R.id.tv_estado);

        ciclo_vida = "Estado: onCreate";
        txvEstado.setText(ciclo_vida);
         }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CLASEANDORID", "ONSTART");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CLASEANDORID", "ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CLASEANDORID", "ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CLASEANDORID", "ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CLASEANDORID", "ONDESTROY");
    }

    public void iniciarActivity(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);

    }
    public void finalizarActivity(View view){
        finish();
    }
}

