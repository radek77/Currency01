package com.company;

public class Currency {

    private int amount;

    public float getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(float currencyRate) {
        this.currencyRate = currencyRate;
    }

    private float currencyRate;

    public Currency(int amt) {
        amount = amt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 2500) {
            System.out.println("Salary to low!");
        }
        this.amount = amount;
    }

    public Currency convertToPounds() {
        return new Currency(Math.round(amount / currencyRate));
    }
}
