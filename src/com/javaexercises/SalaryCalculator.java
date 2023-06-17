package com.javaexercises;

import java.util.Scanner;

public class SalaryCalculator {

    public static double calculateEmployeeSalary(double hoursPerDay, double DaysWorked, double paymentPerHour, double vacationDays) {
        double hoursPerWeek = hoursPerDay * DaysWorked;
        System.out.println("Hours worked per week: " + hoursPerWeek);
        double grossSalary = (hoursPerWeek * paymentPerHour) * 52;
        System.out.println("Vacation days taken per year: " + vacationDays);
        double unpaidLeaves = vacationDays * (8 * paymentPerHour);
        System.out.println("Yearly Gross salary : $" + grossSalary);
        System.out.println("Vacation days payment reduction: $" + unpaidLeaves);
        return grossSalary - unpaidLeaves;
    }

    public static void main(String[] args) {
        /*
         * Input 01: hours employee works per week
         * Input 02: amount of money employee makes per hour
         * Output: Employee gross yearly salary
         *
         * Bonus: Add an input that accounts for vacation days,
         * Employee doesn't get paid on vacation days
         * Vacation day = 8 hours of work
         * */

        System.out.println("<===== Salary Calculator =====>");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours do you work per day?");
        double workingHours = input.nextDouble();
        System.out.println("How many days do you work per week?");
        double workingDays = input.nextDouble();
        System.out.println("How much do you make per hour?");
        double earnedPerHour = input.nextDouble();
        System.out.println("How many vacation days did you take?");
        double vacationsPerYear = input.nextDouble();
        System.out.println("Your yearly gross salary: $" + calculateEmployeeSalary(workingHours, workingDays, earnedPerHour, vacationsPerYear));
    }
}
