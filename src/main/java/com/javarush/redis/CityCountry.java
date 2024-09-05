package com.javarush.redis;

import com.javarush.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;

public class CityCountry {
    private Integer id;

    private String name;

    private String district;

    private Integer population;

    private String countryCode;

    private String alternativeCountryCode;

    private String countryName;

    private Continent continent;

    private String countryRegion;

    private BigDecimal countrySurfaceArea;

    private Integer countryPopulation;

    private Set<Language> languages;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountrySurfaceArea(BigDecimal countrySurfaceArea) {
        this.countrySurfaceArea = countrySurfaceArea;
    }

    public BigDecimal getCountrySurfaceArea() {
        return countrySurfaceArea;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getAlternativeCountryCode() {
        return alternativeCountryCode;
    }

    public void setAlternativeCountryCode(String alternativeCountryCode) {
        this.alternativeCountryCode = alternativeCountryCode;
    }

}