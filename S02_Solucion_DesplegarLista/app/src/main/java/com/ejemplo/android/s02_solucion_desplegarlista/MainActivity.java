package com.ejemplo.android.s02_solucion_desplegarlista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO (1) Declarar una variable de tipo TextView que lleve el nombre de listaSuperTextView
    TextView listaSuperTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (3) Usar findViewByID para relacionar el TextView del layout con findViewById()
        listaSuperTextView = (TextView) findViewById(R.id.super_nombres);
        // TODO (4) Usa el metodo ListaSuper.obtenerListado y guarda los datos en un arreglo de Strings
        String [] lista = ListaSuper.obtenerListado();
        // TODO (5) Cree un loop a través de cada producto y añadalo al TextView (añada \n para darle espacio)
        for(String producto : lista){
            listaSuperTextView.append(producto + "\n\n\n");

        }
    }
}
