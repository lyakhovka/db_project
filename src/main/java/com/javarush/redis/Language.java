package com.javarush.redis;

import java.math.BigDecimal;

public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

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