package com.javaadvance;

class Data {
    private int Id;
    private String password;

    // Getters & Setters
    public int getId() { // Get stored Id value
        return Id;
    }

    public void setId(int id) { // Set an Id value
        Id = id;
    }

    public String getPassword() { // Get stored password value
        return password;
    }

    public void setPassword(String password) { // Set a password value
        this.password = password;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Data newObject = new Data();
        newObject.setId(728127); // Value is set to ID
        System.out.println(newObject.getId()); // ID value is printed
    }
}
