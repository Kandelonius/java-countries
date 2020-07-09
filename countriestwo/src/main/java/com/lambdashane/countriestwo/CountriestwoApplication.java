package com.lambdashane.countriestwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriestwoApplication
{
    public static CountryList ourCountryList;
    public static void main(String[] args)
    {
        ourCountryList = new CountryList();
        SpringApplication.run(CountriestwoApplication.class,
            args);
    }

}
