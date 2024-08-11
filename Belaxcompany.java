
 

   class balexCompany {
    public static void calculatePay(double basePay, double hoursWorked) {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: Employees cannot work more than 60 hours per week.");
            return;
        }

        double regularPay = 40 * basePay;
        double overtimePay = (hoursWorked - 40) * (basePay * 1.5);
        double totalPay = regularPay + overtimePay;

        System.out.printf("Total pay for the week: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        // Employee 1
        calculatePay(7.50, 35);

        // Employee 2
        calculatePay(8.20, 47);

        // Employee 3
        calculatePay(10.00, 73);
    }
 }