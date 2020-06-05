package com.javacountries.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController
{

    // http://localhost:8080
    @GetMapping(value = "/names/all",
        produces = {"application/json"})
    public ResponseEntity<?> getAllCountries()
    {
        JavaCountriesApplication.ourCountryList.countryList
            .sort((c1, c2) ->
                (c1.getName().compareToIgnoreCase(c2.getName())));
        return new ResponseEntity<>
            (JavaCountriesApplication.ourCountryList.countryList,
                HttpStatus.OK);
    }
}
