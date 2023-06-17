package com.javaexercises;

class StudentProfile {
    String firstName;
    String lastName;
    String DeclaredMajor;
    int ExpectedYearToGraduate;
    double GPA;

    StudentProfile(String firstName,
                   String lastName,
                   int ExpectedYearToGraduate,
                   double GPA,
                   String DeclaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ExpectedYearToGraduate = ExpectedYearToGraduate;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;
    }

    public int graduationIncrease() {
        return ExpectedYearToGraduate++;
    }
}


public class StudentProfileApp {
    public static void main(String[] args) {
//        Create a student profile.

        StudentProfile studentOne = new StudentProfile("Kane", "Iroshan", 2023, 2.8, "Software Engineering");
        System.out.println("1st Student's Alias:");
        System.out.println("First Name: " + studentOne.firstName);
        System.out.println("First Name: " + studentOne.lastName);
        System.out.println("Expected Year To Graduate: " + studentOne.ExpectedYearToGraduate);
        System.out.println("GPA: " + studentOne.GPA);
        System.out.println("Declared Major: " + studentOne.DeclaredMajor);
        System.out.println(" ");

        StudentProfile studentTwo = new StudentProfile("Micheal", "Knight", 2022, 2.0, "Software Engineering");
        System.out.println("2nd Student's Alias:");
        System.out.println("First Name: " + studentTwo.firstName);
        System.out.println("First Name: " + studentTwo.lastName);
        System.out.println("Expected Year To Graduate: " + studentTwo.ExpectedYearToGraduate);
        System.out.println("GPA: " + studentTwo.GPA);
        System.out.println("Declared Major: " + studentTwo.DeclaredMajor);

        studentTwo.graduationIncrease();
        System.out.println("Revised Expected Year To Graduate: " + studentTwo.ExpectedYearToGraduate);


        /*
         * Should contain following,
         * - First Name
         * - Last Name
         * - Expected year to graduate
         * - GPA
         * - Declared Major
         * - Have one behavior (function)
         * ==> One behavior should increment student Expected year to graduate by 1.
         * - Student profile class should have a constructor.
         * ==> it should initialize all attributes with dynamic values.
         * ==> Values from which constructor is called will determine attribute values.
         * - Create 2 student profile instances.
         * - You should call "incrementExpectedGraduationYear"
         * */
    }
}
