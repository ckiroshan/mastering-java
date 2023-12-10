package com.javaapps;

import javax.swing.*;

public class SimpleDialogBox {
    public static void main(String[] args) {
        // Simple Dialog box

        String name = JOptionPane.showInputDialog("Enter your Name"); // Fetch Name
        JOptionPane.showMessageDialog(null, "Hey, " + name + "!"); // Display Name

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age")); // Fetch Age
        JOptionPane.showMessageDialog(null, "You are " + age + " years old!"); // Display Age

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in 'cm'")); // Fetch Age
        JOptionPane.showMessageDialog(null, "You are " + height + "'cm' tall!"); // Display Name

    }
}
