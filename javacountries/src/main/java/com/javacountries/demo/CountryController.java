package com.javacountries.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController
{

    // http://localhost:8080/names/all
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

    // http://localhost:8080/names/size/20
    @GetMapping(value = "/names/size/{number}",
        produces = {"application/json"})
    public ResponseEntity<?> getCountriesByNumber(
        @PathVariable
            int number)
    {
        List<Country> rtnCounts = JavaCountriesApplication.ourCountryList.
            findCountries(c -> c.getName().length() >= number);
        rtnCounts.sort((c1, c2) ->
            (c1.getName().compareToIgnoreCase(c2.getName())));
        return new ResponseEntity<>(rtnCounts,
            HttpStatus.OK);
    }
    // http://localhost:8080/population/size/1000000000
    @GetMapping(value = "/population/size/{people}",
        produces = {"application/json"})
    public ResponseEntity<?> getCountriesByPopulation(
        @PathVariable
            int people)
    {
        List<Country> rtnCounts = JavaCountriesApplication.ourCountryList.
            findCountries(c -> c.getPopulation() >= people);
        rtnCounts.sort((c1, c2) -> (int)
            (c1.getPopulation() - c2.getPopulation()));
        return new ResponseEntity<>(rtnCounts,
            HttpStatus.OK);
    }
//    List<Long> population = new ArrayList<>();

    // http://localhost:8080/population/min
    @GetMapping(value = "/population/min",
        produces = {"application/json"})
    public ResponseEntity<?> getCountryByMinPopulation()
    {

        JavaCountriesApplication.ourCountryList.countryList
            .sort((c1, c2) -> (int)
                (c1.getPopulation() - c2.getPopulation()));
//        System.out.println(JavaCountriesApplication.ourCountryList.countryList);
        return new ResponseEntity<>
            (JavaCountriesApplication.ourCountryList.countryList.get(0),
                HttpStatus.OK);
    }
    // http://localhost:8080/population/max
    @GetMapping(value = "/population/max",
        produces = {"application/json"})
    public ResponseEntity<?> getCountryByMaxPopulation()
    {

        JavaCountriesApplication.ourCountryList.countryList
            .sort((c1, c2) -> (int)
                (c2.getPopulation() - c1.getPopulation()));
        //        System.out.println(JavaCountriesApplication.ourCountryList.countryList);
        return new ResponseEntity<>
            (JavaCountriesApplication.ourCountryList.countryList.get(0),
                HttpStatus.OK);
    }

}
