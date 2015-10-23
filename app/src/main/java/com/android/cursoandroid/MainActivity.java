package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

@Bind(R.id.toolbar) Toolbar toolbar;
    Button btnIniciar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar.setTitle("Aplicacion AJB");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        btnIniciar = (Button) findViewById(R.id.btn_iniciar);
        btnFinalizar = (Button) findViewById(R.id.btn_finalizar);

        btnIniciar.setOnClickListener(this);
        btnFinalizar.setOnClickListener(this);

        /*
        btnIniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                iniciarActivity(v);
            }



        });

                btnFinalizar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finalizarActivity(v);
                    }
                });

                */
    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_toolbar, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.action_msg:
                    Toast.makeText(MainActivity.this, "hola soy un toast", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }


    public void iniciarActivity(View view) {
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);

    }

    public void finalizarActivity(View view) {
        finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == btnIniciar.getId()) {
            iniciarActivity(v);
        } else if (id == btnFinalizar.getId()) {
            finalizarActivity(v);
        }


    }
}

