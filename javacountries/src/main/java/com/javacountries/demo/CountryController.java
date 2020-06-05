package com.javacountries.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
                (c1.getName()
                    .compareToIgnoreCase(c2.getName())));
        return new ResponseEntity<>
            (JavaCountriesApplication.ourCountryList.countryList,
                HttpStatus.OK);
    }

    // http://localhost:8080/names/start/u
    @GetMapping(value = "/names/start/{letter}",
        produces = {"application/json"})
    public ResponseEntity<?> getCountriesByLetter(
        @PathVariable
            char letter)
    {
        List<Country> rtnCounts = JavaCountriesApplication.ourCountryList.
            findCountries(c -> c.getName()
                .toUpperCase()
                .charAt(0) == Character.toUpperCase(letter));
        rtnCounts.sort((c1, c2) ->
            (c1.getName()
                .compareToIgnoreCase(c2.getName())));
        return new ResponseEntity<>(rtnCounts,
            HttpStatus.OK);
    }
}
