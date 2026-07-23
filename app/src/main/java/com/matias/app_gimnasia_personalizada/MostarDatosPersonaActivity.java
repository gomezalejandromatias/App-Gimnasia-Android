package com.matias.app_gimnasia_personalizada;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.matias.app_gimnasia_personalizada.Api.PersonaRepository;
import com.matias.app_gimnasia_personalizada.dominio.Persona;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostarDatosPersonaActivity extends AppCompatActivity {
    private TextView txtNombre;
    private TextView txtEdad;
    private TextView txtPeso;
    private TextView txtAltura;
    private TextView txtObjetivo;
    private TextView txtEnfermedades;
    private TextView txtMolestias;
    private PersonaRepository personaRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mostar_datos_persona);


        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtObjetivo = findViewById(R.id.txtObjetivo);
        txtEnfermedades = findViewById(R.id.txtEnfermedades);
        txtMolestias = findViewById(R.id.txtMolestias);
        personaRepository = new PersonaRepository();

        cargarPersonas();
    }

    private void cargarPersonas() {

        personaRepository.listarPersonas().enqueue(
                new Callback<List<Persona>>() {

                    @Override
                    public void onResponse(
                            Call<List<Persona>> call,
                            Response<List<Persona>> response) {

                        if (!response.isSuccessful()) {

                            Toast.makeText(
                                    MostarDatosPersonaActivity.this,
                                    "Error HTTP: " + response.code(),
                                    Toast.LENGTH_LONG
                            ).show();

                            return;
                        }

                        List<Persona> personas = response.body();

                        if (personas == null || personas.isEmpty()) {

                            Toast.makeText(
                                    MostarDatosPersonaActivity.this,
                                    "La API no devolvió personas",
                                    Toast.LENGTH_LONG
                            ).show();

                            return;
                        }

                        Persona persona = personas.get(0);

                        txtNombre.setText(
                                "Nombre: " + persona.getNombre()
                        );

                        txtEdad.setText(
                                "Edad: " + persona.getEdad()
                        );

                        txtPeso.setText(
                                "Peso: " + persona.getPesoActual()
                        );

                        txtAltura.setText(
                                "Altura: " + persona.getAltura()
                        );

                        txtObjetivo.setText(
                                "Objetivo: " + persona.getObjetivo()
                        );

                        txtEnfermedades.setText(
                                "Enfermedades: " + persona.getEnfermedades()
                        );

                        txtMolestias.setText(
                                "Molestias: " + persona.getMolestias()
                        );

                        Toast.makeText(
                                MostarDatosPersonaActivity.this,
                                "Personas recibidas: " + personas.size(),
                                Toast.LENGTH_LONG
                        ).show();
                    }

                    @Override
                    public void onFailure(
                            Call<List<Persona>> call,
                            Throwable throwable) {

                        Toast.makeText(
                                MostarDatosPersonaActivity.this,
                                "Error: " + throwable.getMessage(),
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
        );
    }
    }