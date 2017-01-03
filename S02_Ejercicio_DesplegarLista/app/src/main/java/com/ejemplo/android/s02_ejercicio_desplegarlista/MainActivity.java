package com.ejemplo.android.s02_ejercicio_desplegarlista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO (1) Declarar un variable de tipo TextView que lleve el nombre de listaSuperTextView

    @Override    //TODO (1) Declarar un variable de tipo TextView que lleve el nombre de listaSuperTextView
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (3) Usar findViewByID para relacionar el TextView del layout
        // TODO (4) Usa el metodo ListaSuper.obtenerListado y guarda los datos en un arreglo de Strings
        // TODO (5) Cree un loop a través de cada producto y añadalo al TextView (añada \n para darle espacio)
    }
}
