package com.company;

public class Main {

    public static void main(String[] args) {

        Currency salary = new Currency(9000);

        System.out.println(salary.getAmount());

        salary.setAmount(11000);

        System.out.println(salary.getAmount());

        salary.setAmount(2600);

        System.out.println(salary.getAmount());

        salary.setCurrencyRate(5.04f);
        Currency salaryInPounds = salary.convertToPounds();

        System.out.println("Salary in British Pounds: " + salaryInPounds.getAmount());

//        Currency net = salary.getNetValue();

        // This is a comment to demonstrate changes in repo
    }
}
