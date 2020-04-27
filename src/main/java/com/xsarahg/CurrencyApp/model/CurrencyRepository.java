package com.xsarahg.CurrencyApp.model;

import org.springframework.data.repository.CrudRepository;

// the CurrencyRepository provides functionality for
// creating, removing, updating and deleting data from the database
public interface CurrencyRepository extends CrudRepository<Currency, Long> {
}
