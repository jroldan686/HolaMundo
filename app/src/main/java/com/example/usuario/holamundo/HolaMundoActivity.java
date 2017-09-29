package com.example.usuario.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 *  Mi primera aplicación de Android
 *  @author Jesús Roldán López
 *  @version 1.0
 *  @see android.app.Activity
 */
public class HolaMundoActivity extends AppCompatActivity {

    private TextView txvMessage;

    @Override
    // Este método ejecuta la inicialización de la Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        txvMessage = (TextView) findViewById(R.id.txvMessage);
        txvMessage.setText(R.string.second_message);
    }
}

