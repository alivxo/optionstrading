package com.tradingplatform.optiontrader.model;

public class Option {

    private String symbol;
    private String expirationDate;
    private String strikePrice;
    private String optionType; // Call or Put
    private String lastPrice;
    private String bidPrice;
    private String askPrice;
    private String volume;
    private String openInterest;

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }
}
// POJO(Plain Old Java Object) class for Options

