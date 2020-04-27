package com.xsarahg.CurrencyApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity // class presents the structure of a data table
@Getter // lombok creates getters
@Setter // lombok creates setters
public class Currency {

    @Id // defines primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    // id is automatically generated in the database
    // AUTO means that JPA will select the best strategy for a particular database
    private long id;

    private String name;
    private String code;
    private BigDecimal amount;
    private BigDecimal rate;

    public Currency(String name, String code, BigDecimal amount, BigDecimal rate){
        this.name = name;
        this.code = code;
        this.amount = amount;
        this.rate = rate;
    }

}
