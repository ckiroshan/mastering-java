package Enumeration;

enum Status {
    Running, Failed, Pending, Completed;
}

public class Enumeration {
    public static void main(String[] args) {
        // Status is a class. r,f are objects
        Status r = Status.Running;
        Status f = Status.Failed;
        System.out.println(r); // Running
        System.out.println(f); // Failed
        System.out.println();

        Status[] all = Status.values(); // Gets all status values
        for (Status s : all) {
            System.out.print(s + " "); // Running Failed Pending Completed
        }
        System.out.println();
    }
}
