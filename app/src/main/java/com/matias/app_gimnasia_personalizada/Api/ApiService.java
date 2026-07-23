package com.matias.app_gimnasia_personalizada.Api;
import com.matias.app_gimnasia_personalizada.dominio.Persona;

import java.util.List;

 import retrofit2.Call;
 import retrofit2.http.GET;
public  interface ApiService {

   @GET("persona")
   Call<List<Persona>> listarPersonas();

}
