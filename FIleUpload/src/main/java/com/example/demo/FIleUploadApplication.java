package com.example.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.example.demo.controller", "com.example.demo"})
public class FIleUploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FIleUploadApplication.class, args);
	}

}
