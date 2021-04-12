package com.example.demo.serviceimpl;

import com.example.demo.services.Services;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ServiceImpl implements Services {

    public Response checkWeather() {
     // https://rapidapi.com/sangatpuria01/api/weather-com/endpoints
    Response response = null;
    try {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://weather-com.p.rapidapi.com/v3/wx/disease/tracker/countryList/current?language=en")
                .get()
                .addHeader("x-rapidapi-key", "f15361ddf9msh28bb1e5eddebea5p16c2d3jsn54743eea0a7f")
                .addHeader("x-rapidapi-host", "weather-com.p.rapidapi.com")
                .build();

        response = client.newCall(request).execute();

    }
    catch (IOException e) {
        e.printStackTrace();
    }
        return response;
    }



}
