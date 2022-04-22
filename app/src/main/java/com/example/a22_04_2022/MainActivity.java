package com.example.a22_04_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ETPalabra;
    private Button BTNProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarvistas();
        BTNProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarmensaje();
            }
        });
        // Funcion de flecha (Namda) Investigar
        BTNProcesar.setOnClickListener(view -> mostrarmensaje());
    }

    private void iniciarvistas() {
        ETPalabra = findViewById(R.id.ETPalabra);
        BTNProcesar = findViewById(R.id.BTNProcesar);
    }
    private void mostrarmensaje() {
        /*
        Ventana emergente en pantalla, pequeña y casual
        se muestra durante unos instantes y es para
        mostrar algo durante unos instantes y es para mostrar algo en
        particular al usuario...
        el componente se llama Toast, para configurar necesitas
        aplicar un metodo llamdo .makeText() que tiene una serie de parametros:
            - Ambito o contexto de la pantalla donde se va a dibujar.
            - Cadena de texto que deseas que se muestre al usuario.
            - Duracion de ventana, esta configuracion sobre 2 costantes ya establecidos.
        finalmente para mostrar esa ventana tienen que usar un metodo
        llamado .show()
         */
        String mensaje = "Bendito contexto!";
        //Metodos y atributos estaticos
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}