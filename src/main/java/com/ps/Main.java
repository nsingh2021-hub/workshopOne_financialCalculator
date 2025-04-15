package com.ps;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Pick a calculator");

        // p - 53,000
        // r = .07625
        // y = 15

//        i = 07625/12
//        i = .00635417

//        n = 15*12
//        n = 180

//        53,000 * (.00635417 * (1+.00635417)^(15*12) / ((1+.00635417)^(15*12)-1) = 495.09
//        53,000 * (.00635417 * (1.00635417)^(180) / ((1.00635417)^(180)-1) = 495.09
//        53,000 * (.00635417 * (3.12718152) / (2.12718152) = 495.09
//        53,000 * (.00635417 * (3.12718152) / (2.12718152) = 495.09
//        53,000 * 0.0093413


        calcMonthlyPayment(53000,.07625,15);
//        495.09 * (15*12) - 5300 = 36,115.99

        // payment: 495.09
        // total_interest: 36,115.99

        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future Value Calculator");
        System.out.println("0) Exit");
        System.out.println("Select a calculator: ");
        int command = scanner.nextInt();

        switch(command){
            case 1:
                System.out.print("Provide a prinipal: ");
                int principal = scanner.nextInt();

                System.out.print("Provide annual interest rate: ");
                double annualInterestRate = scanner.nextDouble();

                System.out.println("Provide loan term in years: ");
                int loanTermYears = scanner.nextInt();
                break;


            case 2:
                System.out.println("Run future Calculator");
                break;

            case 3:
                System.out.println("Exit");
                break;




        }

    }

    public static void calcMonthlyPayment(int principal, double annualInterest, int loanTermYears) {
        // p - 53,000
        // r = .07625
        // y = 15
        double monthlyInterest = annualInterest/12;
        int loanTermMonths = loanTermYears*12;

        double interestRateCalculation =  Math.pow(1+monthlyInterest, loanTermYears);

//        i = 07625/12
//        i = .00635417

//        n = 15*12
//        n = 180

        double monthlyPayment = principal * (monthlyInterest * interestRateCalculation) / (interestRateCalculation - 1);

//        53,000 * (.00635417 * (1+.00635417)^(15*12) / ((1+.00635417)^(15*12)-1) = 495.09
//        53,000 * (.00635417 * (1.00635417)^(180) / ((1.00635417)^(180)-1) = 495.09
//        53,000 * (.00635417 * (3.12718152) / (2.12718152) = 495.09
//        53,000 * (.00635417 * (3.12718152) / (2.12718152) = 495.09
//        53,000 * 0.0093413

        System.out.println(monthlyPayment);

        // payment: 495.09


    }
}



