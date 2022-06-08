import static java.lang.System.exit;

import java.util.Scanner;

public class App {

    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");

        do {

        if (response.equals("add")) {                                               //addition 
            double num1 = getDouble("Enter in a number: ");                           //asks for first number
            double num2 = getDouble("Enter in a second number: ");                    //asks for second number
            Calculator calcAdd = new Calculator();                                            //instantiates Calculator
            System.out.println("Answer: " + calcAdd.add(num1, num2));                         //Prints out result
            response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");      //re-prompts user on next step
        }

        if (response.equals("subtract")) {                                     //subtraction
            double num3 = getDouble("Enter in a number: ");
            double num4 = getDouble("Enter in a second number: ");
            Calculator calcSub = new Calculator();
            System.out.println("Answer: " + calcSub.subtract(num3, num4));
            response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");
        }

        if (response.equals("multiply")) {                                   //multiplication
            double num5 = getDouble("Enter in a number: ");
            double num6 = getDouble("Enter in a second number: ");
            Calculator calcMult = new Calculator();
            System.out.println("Answer: " + calcMult.multiply(num5, num6));
            response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");
        }

        if (response.equals("divide")) {                                    //division
            double num7 = getDouble("Enter in a number: ");
            double num8 = getDouble("Enter in a second number: ");
            if (num7 == 0 || num8 == 0) {
                System.out.println("Can't divide by zero.");
                response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");
            } else {
            Calculator calcDiv = new Calculator();
            System.out.println("Answer: " + calcDiv.divide(num7, num8));  
            response = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");
            }
        }
        
    } while (!response.equals("exit"));
        
        System.out.println("Bye, Felicia");
        exit(0);
  
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String input = inputScanner.next();
        return input;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double result = inputScanner.nextDouble();
        return result;
    }


    }

