package com.example.demo;

import com.example.demo.serviceimpl.ServiceImpl;
import com.example.demo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.squareup.okhttp.*;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {


	public DemoApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ServiceImpl serviceImpl = new ServiceImpl();

		Response response = serviceImpl.checkWeather();

		System.out.println(response);
	}

}
