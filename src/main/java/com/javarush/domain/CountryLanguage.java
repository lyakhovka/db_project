package com.javarush.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;

    private BigDecimal percentage;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }
}