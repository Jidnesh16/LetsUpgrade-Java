package com.employee;

public class Main {

    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "Jidnesh";
        emp.age = 21;
        emp.city = "Navi Mumbai";
        emp.display();

        employee e = new employee();
        e.name = "Harry";
        e.age = 22;
        e.city = "Hogwarts";
        e.display();
    }
}