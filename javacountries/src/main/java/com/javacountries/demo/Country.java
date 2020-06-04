package com.javacountries.demo;

public class Country
{
    // fields
    private String name;
    private int population;
    private int landMassKm2;
    private int medianAge;

    public Country(
        String name,
        int population,
        int landMassKm2,
        int medianAge)
    {
        this.name = name;
        this.population = population;
        this.landMassKm2 = landMassKm2;
        this.medianAge = medianAge;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public int getLandMassKm2()
    {
        return landMassKm2;
    }

    public void setLandMassKm2(int landMassKm2)
    {
        this.landMassKm2 = landMassKm2;
    }

    public int getMedianAge()
    {
        return medianAge;
    }

    public void setMedianAge(int medianAge)
    {
        this.medianAge = medianAge;
    }
}
