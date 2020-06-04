package com.javacountries.demo;

public class Country
{
    // fields
    private String name;
    private long population;
    private int landMassKm2;
    private int medianAge;

    public Country(
        String name,
        long population,
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

    public long getPopulation()
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

    @Override
    public String toString()
    {
        return "Country{" +
            "name='" + name + '\'' +
            ", population=" + population +
            ", landMassKm2=" + landMassKm2 +
            ", medianAge=" + medianAge +
            '}';
    }
}
