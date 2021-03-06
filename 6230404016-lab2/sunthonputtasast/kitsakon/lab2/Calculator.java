/**
* Calculator which can add, subtract, multiply, or divide any  decimal numbers.
* The program also displays the execution time since the program runnings until the user types "q" or "Q".
* if mark is / ,the seccond number can't be a Zero(0)
*
* Author: Kitsakon Sunthonputtasast
* ID: 623040401-6
* Sec: 1
* Date: December 16, 2019
*
**/
package sunthonputtasast.kitsakon.lab2;

import java.text.DecimalFormat;

public class Calculator {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        if (args[0].equals("q") || args[0].equals("Q")) {
            System.out.println("Quitting the program");
            return;
        } else if (args.length != 3) {
            System.out.println("Calculator <operation> <firstNum> <seccondNum>");
            return;
        } else if (args[0].equals("/") && args[2].equals("0")) {
            System.out.println("The seccond operand cannot be zero");
            return;
        } else {
            double result = 0;
            String operation = args[0];
            double firstNum = Double.parseDouble(args[1]);
            double seccondNum = Double.parseDouble(args[2]);
            if (operation.equals("+")) {
                result = firstNum + seccondNum;
            } else if (operation.equals("-")) {
                result = firstNum - seccondNum;
            } else if (operation.equals("/")) {
                result = firstNum / seccondNum;
            } else if (operation.equals("x")) {
                result = firstNum * seccondNum;
            } else {
                System.out.println("Unknow operation");
                return;
            }
            System.out.println(firstNum + " " + operation + " " + seccondNum + " = " + df.format(result));
        }

    }
}
