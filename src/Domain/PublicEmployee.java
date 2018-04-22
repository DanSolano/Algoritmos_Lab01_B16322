/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 * @version1.0
 * @author Daniel Solano
 */
public class PublicEmployee extends Employee {

    String contractType;

    public PublicEmployee() {
    }

    public PublicEmployee(String contractType, String dni, String name, String phone, String address, double workedHours, double salaryPerHour) {
        super(dni, name, phone, address, workedHours, salaryPerHour);
        this.contractType = contractType;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "PublicEmployee: " + "contractType=" + contractType;
    }

}
