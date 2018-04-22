/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 * Manages the complete information of a general worker
 *
 * @version 1.0
 * @author Daniel Solano
 */
public class Employee {

    String dni;
    String name;
    String phone;
    String address;
    double workedHours;
    double salaryPerHour;

    public Employee() {
    }

    public Employee(String message) {
        System.out.println(message);
    }

    public Employee(String dni, String name, String phone, String address, double workedHours, double salaryPerHour) {
        this.dni = dni;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.workedHours = workedHours;
        this.salaryPerHour = salaryPerHour;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "Employee:   " + "dni=" + dni + ", name=" + name + ", phone="
                + phone + ", address=" + address + ", workedHours="
                + workedHours + ", salaryPerHour=" + salaryPerHour;
    }

}
