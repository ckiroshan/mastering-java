package com.javabasics;

public class Operators {
    @SuppressWarnings({"ConstantConditions", "PointlessBooleanExpression", "UnusedAssignment"})
    public static void main(String[] args) {
//        Arithmetic Operators
        int number1 = 10;
        int number2 = 25;

        System.out.println(number2 + number1); // Output: 25 + 10 = 35
        System.out.println(number2 - number1); // Output: 25 - 10 = 15
        System.out.println(number2 * number1); // Output: 25 * 10 = 250
        System.out.println(number2 / number1); // Output: 25 / 10 = 2
        System.out.println(number2 % number1); // Output: 25 % 10 = 5
        System.out.println(" ");

//        Relational Operators
        System.out.println(number2 > number1); // Output: true
        System.out.println(number2 < number1); // Output: false
        System.out.println(number2 >= number1); // Output: true
        System.out.println(number2 <= number1); // Output: true
        System.out.println(" ");

//        Equality Operators
        System.out.println(number2 == number1); // Output: 20 equals 10 => false
        System.out.println(number2 != number1); // Output: 20 not equals 10 => true
        System.out.println(" ");

//        Assignment Operators
        System.out.println(number2 += number1); // Output: 25 + 10 = 35
        System.out.println(number2 -= number1); // Output: 35 - 10 = 25
        System.out.println(number2 *= number1); // Output: 25 * 10 = 250
        System.out.println(number2 /= number1); // Output: 250 / 10 = 25
        System.out.println(number2 %= number1); // Output: 25 % 10 = 5
        System.out.println(" ");

//        Logical Operators
        int personAge = 23;
        boolean SLCitizen = true;

        System.out.println(personAge >= 18 && SLCitizen == true);  // Output: true => If person >= 18 and Citizen?
        System.out.println(personAge >= 18 || SLCitizen == true);  // Output: true => If person >= 18 or Citizen?
        System.out.println(!SLCitizen == true);                    // Output: false => not Citizen is true?

//        Ternary Operators
//                 Condition: personAge greater or equal to 18 == 'eligible. else 'not eligible'.
        String isHeEligible = personAge >= 18 ? "eligible" : "not eligible";
//        If '?' executes => true
//        If ':' executes => false
        System.out.println(isHeEligible);

        int newNumber = 20;
//        '++ newNumber' => pre-increment. adds 1 before it gets printed.
        System.out.println(++newNumber);
        newNumber = 20;
//        'newNumber ++' => post-increment. adds 1 after it gets printed.
        System.out.println(newNumber++);

        newNumber = 20;
        int newNumber2 = newNumber++; // newNumber gets assigned to newNumber2. after that only gets incremented
        System.out.println(newNumber2);
        newNumber = 20;
        newNumber2 = ++newNumber; // newNumber gets incremented before it gets assigned to newNumber2.
        System.out.println(newNumber2);
    }
}
