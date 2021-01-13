package com.company;

public class Main {

    public static void main(String[] args) {

        Currency salary = new Currency(7000);

        System.out.println(salary.getAmount());

        salary.setAmount(10000);

        System.out.println(salary.getAmount());

        salary.setAmount(2500);

        System.out.println(salary.getAmount());

        salary.setCurrencyRate(5.04f);
        Currency salaryInPounds = salary.convertToPounds();

        System.out.println("Salary in British Pounds: " + salaryInPounds.getAmount());

//        Currency net = salary.getNetValue();
    }
}
