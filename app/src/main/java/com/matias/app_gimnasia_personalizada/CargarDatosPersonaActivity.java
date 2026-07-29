package com.matias.app_gimnasia_personalizada;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.matias.app_gimnasia_personalizada.Api.ApiService;
import com.matias.app_gimnasia_personalizada.Api.PersonaRepository;
import com.matias.app_gimnasia_personalizada.dominio.Persona;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CargarDatosPersonaActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEdad;
    private EditText etPeso;
    private EditText etAltura;
    private EditText etObjetivo;
    private EditText etEnfermedades;
    private EditText etMolestias;
    PersonaRepository personarepository = new PersonaRepository();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cargar_datos_persona);

        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        etObjetivo = findViewById(R.id.etObjetivo);
        etEnfermedades = findViewById(R.id.etEnfermedades);
        etMolestias = findViewById(R.id.etMolestias);



    }


    public void EventobtnGuardarDatos(View view) {

        String Nombre = etNombre.getText().toString();
        String Edad = etEdad.getText().toString();
        String Peso = etPeso.getText().toString();
        String Altura = etAltura.getText().toString();
        String Objetivo = etObjetivo.getText().toString();
        String Enfermedades = etEnfermedades.getText().toString();
        String Molestias = etMolestias.getText().toString();

        Persona persona = new Persona();

        persona.setNombre(Nombre);
        persona.setEdad(Integer.parseInt(Edad));
        persona.setPesoActual(Double.parseDouble(Peso));
        persona.setAltura(Double.parseDouble(Altura));
        persona.setObjetivo(Objetivo);
        persona.setEnfermedades(Enfermedades);
        persona.setMolestias(Molestias);

        personarepository.agregarPersona(persona).enqueue(new Callback<Void>() {

            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                // La API respondió.
            }

            @Override
            public void onFailure(Call<Void> call, Throwable error) {
                // No se pudo conectar con la API.
            }
        });


        Intent intent =  new Intent(this, MostarDatosPersonaActivity.class);

        intent.putExtra("Nombre", Nombre);
        intent.putExtra("Edad", Edad);
        intent.putExtra("Peso", Peso);
        intent.putExtra("Altura", Altura);
        intent.putExtra("Objetivo", Objetivo);
        intent.putExtra("Enfermedades", Enfermedades);
        intent.putExtra("Molestias", Molestias);

        startActivity(intent);





    }

}
