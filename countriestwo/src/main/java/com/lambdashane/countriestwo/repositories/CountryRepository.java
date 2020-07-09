package com.lambdashane.countriestwo.repositories;

import com.lambdashane.countriestwo.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long>
{
}
