package com.matias.app_gimnasia_personalizada.Api;

import com.matias.app_gimnasia_personalizada.dominio.Persona;

import java.util.List;

import retrofit2.Call;

public class PersonaRepository {


    private final ApiService apiService;

    public PersonaRepository() {

        apiService = RetrofitClient
                .getRetrofit()
                .create(ApiService.class);
    }

    public Call<List<Persona>> listarPersonas() {

        return apiService.listarPersonas();

    }



}
