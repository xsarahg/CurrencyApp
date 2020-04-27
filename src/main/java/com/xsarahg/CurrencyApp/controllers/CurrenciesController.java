package com.xsarahg.CurrencyApp.controllers;

import com.xsarahg.CurrencyApp.model.Currency;
import com.xsarahg.CurrencyApp.model.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // marks the class as a MVC controller
public class CurrenciesController {

    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrenciesController(CurrencyRepository currencyRepository){
        this.currencyRepository = currencyRepository;
    }

    @GetMapping("/currencies")
    public Iterable<Currency> getCurrencies(){
        return currencyRepository.findAll();
    }

    @PostMapping("/currencies")
    public void addCurrency(@RequestBody Currency currency){
        currencyRepository.save(currency);
    }

    @PutMapping("/currencies")
    public void updateCurrency(@RequestBody Currency currency){
        currencyRepository.save(currency);
    }

    @DeleteMapping("currencies/{id}")
    public void deleteCurrency(@PathVariable Long id){
        currencyRepository.deleteById(id);
    }
}
