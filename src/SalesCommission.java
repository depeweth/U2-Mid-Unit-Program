/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

/* Get my baseline down for what information is needed
should start on getting outputs out so I can see the awnsers I type in
start on the calculations that I would need to make it work/keep testing as I am going to make sure that is all works correctly
get rounding code going for both piece before bring them together
look back to tax to find how to do the commission compaired with the total sales
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double com = Double.parseDouble(JOptionPane.showInputDialog("What is the commission amount"));
        double TW = Double.parseDouble(JOptionPane.showInputDialog("What is the amount of hours worked"));
        double WA = Double.parseDouble(JOptionPane.showInputDialog("What is the wage amount"));
        double TS = Double.parseDouble(JOptionPane.showInputDialog("What is the total sale amount"));

        JOptionPane.showMessageDialog(null, "The total wage is " + totalwage(TW,WA));
        JOptionPane.showMessageDialog(null, "The commission is " + totalcar(com,TS));
        JOptionPane.showMessageDialog(null, "The commission is " + total(totalwage(TW,WA),totalcar(com,TS)));

        System.exit(0);
    }

    public static double commison(double com){

        return com;
    }

    public static double time(double TW){

        return TW;
    }

    public static double wage(double WA){

        return WA;
    }

    public static double sale(double TS){

        return TS;
    }

    public static double totalwage(double TW, double WA){

        return TW * WA;
    }

    public static double totalcar(double com, double TS){

        return com * TS;
    }

    public static double total(double totalwage, double totalcar){

        return totalcar + totalwage;
    }
    public static void outPutResults(double total){
        DecimalFormat round = new DecimalFormat("#,##.00");

        JOptionPane.showMessageDialog(null, "The total is " + round.format(total));
    }

}
