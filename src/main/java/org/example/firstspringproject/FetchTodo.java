package org.example.firstspringproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class FetchTodo {
    public String getResponse(String id) throws IOException {
        String baseUrl = "https://jsonplaceholder.typicode.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);

        Todo t = todoService.getTodo(id).execute().body();

        return t.toString();
    }
}
