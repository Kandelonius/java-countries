package com.javacountries.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCountriesApplication
{
    public static CountryList ourCountryList;
    // main method
    public static void main(String[] args)
    {
        ourCountryList = new CountryList();
        SpringApplication.run(JavaCountriesApplication.class,
            args);
    }
}
