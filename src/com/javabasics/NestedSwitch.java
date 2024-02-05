package com.javabasics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeID = input.nextInt();
        String department = input.next();

        switch (employeeID) {
            case 1:
                System.out.println("Kane Norton");
                break;
            case 2:
                System.out.println("James Norton");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Business":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("No Norton");
        }

        // Same in enhanced switch
        switch (employeeID) {
            case 1 -> System.out.println("Kane Norton");
            case 2 -> System.out.println("James Norton");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Business" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("No Norton");
        }
    }
}
