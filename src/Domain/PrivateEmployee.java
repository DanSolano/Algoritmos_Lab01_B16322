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
public class PrivateEmployee extends Employee {

    private boolean isTemporary;

    public PrivateEmployee() {
        super("Creacion  de  un nuevo empleado");
    }

    public PrivateEmployee(boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public PrivateEmployee(String dni, String name, String phone, String address, double workedHours, double salaryPerHour) {
        super(dni, name, phone, address, workedHours, salaryPerHour);
    }

    public PrivateEmployee(boolean isTemporary, String dni, String name, String phone, String address, double workedHours, double salaryPerHour) {
        super(dni, name, phone, address, workedHours, salaryPerHour);
        this.isTemporary = isTemporary;
    }

    public boolean isIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    @Override
    public String toString() {
        return "PrivateEmployee| " + "isTemporary: " + isTemporary;
    }
    

}
